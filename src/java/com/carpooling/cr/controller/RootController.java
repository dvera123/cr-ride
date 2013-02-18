/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carpooling.cr.controller;

import com.carpooling.cr.domain.Root;
import com.carpooling.cr.model.dao.RootDAO;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Vera
 */
public class RootController extends MultiActionController{
    
    private RootDAO rootDAO;
    
    /**
     *
     * Method who get a list of roots from the model and map them with the view
     */
    public ModelAndView viewRoot(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("rootList", rootDAO.listRoot());
        modelMap.addAttribute("root", new Root());

        return new ModelAndView("view_root", modelMap);
    }

    /**
     * @param rootDAO the rootDAO to set
     */
    public void setRootDAO(RootDAO rootDAO) {
        this.rootDAO = rootDAO;
    }
    
}
