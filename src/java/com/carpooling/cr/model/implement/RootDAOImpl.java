/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carpooling.cr.model.implement;

import com.carpooling.cr.domain.Root;
import com.carpooling.cr.model.dao.RootDAO;
import com.carpooling.cr.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Vera
 */
public class RootDAOImpl implements RootDAO{
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public void saveRoot(Root root) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateRoot(Root root) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeRootById(int rootId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Root> listRoot() {
        
        Query qr = session.getNamedQuery("Root.findAll");
        return qr.list();
    }

    @Override
    public Root getRootByCriteria(int rootId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
