/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carpooling.cr.model.dao;

import com.carpooling.cr.domain.Root;
import java.util.List;

/**
 *
 * @author Vera
 */
public interface RootDAO {
    
    public void saveRoot(Root root);
    
    public void updateRoot(Root root);
    
    public void removeRootById(int rootId);

    public List<Root> listRoot();    
    
    public Root getRootByCriteria(int rootId);
    
}
