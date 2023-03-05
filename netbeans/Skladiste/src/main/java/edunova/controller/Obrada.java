/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Entitet;
import edunova.util.HibernateUtil;
import edunova.util.SkladisteException;
import java.util.List;
import org.hibernate.Session;


public abstract class Obrada<T extends Entitet> {

    protected T entitet;
    protected Session session;

    public abstract List<T> read();

    protected abstract void kontrolaUnosa() throws SkladisteException;

    protected abstract void kontrolaPromjena() throws SkladisteException;

    protected abstract void kontrolaBrisanje() throws SkladisteException;

    public Obrada() {
        this.session = HibernateUtil.getSession();
    }

    public void create() throws SkladisteException {
        if (entitet == null) {
            throw new SkladisteException("Entitet je null");
        }
        kontrolaUnosa();
        persist();
    }

    public void update() throws SkladisteException {
        kontrolaPromjena();
        persist();
    }

    public void delete() throws SkladisteException {
        kontrolaBrisanje();
        session.beginTransaction();
        session.remove(entitet);
        session.getTransaction().commit();
    }

    private void persist() {
        session.beginTransaction();
        session.persist(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
}
