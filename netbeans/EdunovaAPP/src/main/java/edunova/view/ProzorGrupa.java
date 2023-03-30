/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import edunova.controller.ObradaGrupa;
import edunova.controller.ObradaPolaznik;
import edunova.controller.ObradaPredavac;
import edunova.controller.ObradaSmjer;
import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import edunova.util.Aplikacija;
import edunova.util.EdunovaException;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class ProzorGrupa 
        extends javax.swing.JFrame
        implements EdunovaViewSucelje{
    
    private ObradaGrupa obrada;
    private ObradaPolaznik obradaPolaznik;

    /**
     * Creates new form ProzorGrupa
     */
    public ProzorGrupa() {
        initComponents();
        obrada = new ObradaGrupa();
        obradaPolaznik = new ObradaPolaznik();
         setTitle(Aplikacija.NAZIV_APP + ": " + 
                Aplikacija.OPERATER.getImePrezime() + 
                ": Grupe");
         definirajDatumPocetka();
        ucitajFilterSmjerovi();
        ucitajSmjerove();
        ucitajPredavace();
         ucitaj();
    }
    
    private void definirajDatumPocetka(){
        DatePickerSettings dps = 
                new DatePickerSettings(new Locale("hr","HR"));
       dps.setFormatForDatesCommonEra("dd. MM. YYYY.");
       dps.setTranslationClear("Očisti");
       dps.setTranslationToday("Danas");
       dpDatumPocetka.setSettings(dps);
    }
    
    private void ucitajSmjerove(){
        DefaultComboBoxModel<Smjer> m
                = new DefaultComboBoxModel<>();
        Smjer s = new Smjer();
        s.setSifra(0);
        s.setNaziv("Nije odabrano");
        m.addElement(s);
        m.addAll(new ObradaSmjer().read());
        cmbSmjerovi.setModel(m);
        cmbSmjerovi.repaint();
    }
    
    private void ucitajPredavace(){
        DefaultComboBoxModel<Predavac> m
                = new DefaultComboBoxModel<>();
        Predavac p = new Predavac();
        p.setSifra(0);
        p.setIme("Nije");
        p.setPrezime("odabrano");
        m.addElement(p);
        m.addAll(new ObradaPredavac().read());
        cmbPredavaci.setModel(m);
        cmbPredavaci.repaint();
    }
    
    private void ucitajFilterSmjerovi(){
        DefaultComboBoxModel<Smjer> m
                = new DefaultComboBoxModel<>();
        m.addAll(new ObradaSmjer().read());
        cmbFilterSmjerovi.setModel(m);
        cmbFilterSmjerovi.repaint();
        cmbFilterSmjerovi.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        cmbFilterSmjerovi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbSmjerovi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbPredavaci = new javax.swing.JComboBox<>();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPolazniciUBazi = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPolazniciNaGrupi = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDodajPolaznika = new javax.swing.JButton();
        btnObrisiPolaznika = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        cmbFilterSmjerovi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFilterSmjeroviItemStateChanged(evt);
            }
        });

        jLabel1.setText("Naziv");

        jLabel2.setText("Smjer");

        jLabel3.setText("Predavač");

        jLabel4.setText("Datum početka");

        jScrollPane2.setViewportView(lstPolazniciUBazi);

        jScrollPane3.setViewportView(lstPolazniciNaGrupi);

        txtUvjet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUvjetKeyPressed(evt);
            }
        });

        btnTrazi.setText("🔍");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jLabel5.setText("Polaznici na grupi");

        jLabel6.setText("Polaznici u bazi");

        btnDodajPolaznika.setText("<<");
        btnDodajPolaznika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajPolaznikaActionPerformed(evt);
            }
        });

        btnObrisiPolaznika.setText(">>");
        btnObrisiPolaznika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiPolaznikaActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(cmbFilterSmjerovi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txtNaziv)
                        .addComponent(jLabel2)
                        .addComponent(cmbSmjerovi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(cmbPredavaci, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)
                    .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDodajPolaznika, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnObrisiPolaznika, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTrazi)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPredavaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDodaj))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnDodajPolaznika)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisiPolaznika))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbFilterSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        if(lstPodaci.getSelectedValue()==null){
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());

        napuniView();

    }//GEN-LAST:event_lstPodaciValueChanged

    private void cmbFilterSmjeroviItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFilterSmjeroviItemStateChanged
        ucitaj();
    }//GEN-LAST:event_cmbFilterSmjeroviItemStateChanged

    private void txtUvjetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUvjetKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ucitajPolaznike();
        }
    }//GEN-LAST:event_txtUvjetKeyPressed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        ucitajPolaznike();
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodajPolaznikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajPolaznikaActionPerformed
        
        if(lstPolazniciUBazi.getSelectedValuesList()==null
                || lstPolazniciUBazi.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(),
                    "Prvo pronađite polaznika/e");
            return;
        }
        
          if(lstPolazniciNaGrupi.getModel()==null || 
                  !(lstPolazniciNaGrupi.getModel() instanceof DefaultListModel<Polaznik>)){
            lstPolazniciNaGrupi.setModel(new DefaultListModel<Polaznik>());
        }
        
        DefaultListModel<Polaznik> m = 
                (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        
        DefaultListModel<Polaznik> polaznici = 
                (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        boolean postoji;
        for(Polaznik pub : lstPolazniciUBazi.getSelectedValuesList()){
            postoji=false;
            for(int i=0;i<polaznici.getSize();i++){
                if(pub.getSifra()==polaznici.get(i).getSifra()){
                    postoji=true;
                    break;
                }
            }
            if(!postoji){
                 polaznici.addElement(pub);
            }
        }
        lstPolazniciNaGrupi.repaint();
        
        
        
       
      
        
        
        
    }//GEN-LAST:event_btnDodajPolaznikaActionPerformed

    private void btnObrisiPolaznikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiPolaznikaActionPerformed
        if(lstPolazniciNaGrupi.getSelectedValuesList()==null
                || lstPolazniciNaGrupi.getSelectedValuesList().isEmpty()){
            JOptionPane.showMessageDialog(getRootPane(),
                    "Prvo odaberite polaznike u grupi");
            return;
        }
        
        DefaultListModel<Polaznik> m = 
                (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        
        for(Polaznik p : lstPolazniciNaGrupi.getSelectedValuesList()){
            m.removeElement(p);
        }
        lstPolazniciNaGrupi.repaint();
        
    }//GEN-LAST:event_btnObrisiPolaznikaActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Grupa());
        napuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void ucitajPolaznike(){
        
        DefaultListModel<Polaznik> m = new DefaultListModel<>();
        m.addAll(obradaPolaznik.read(txtUvjet.getText().trim()));
        lstPolazniciUBazi.setModel(m);
        lstPolazniciUBazi.repaint();
        
    }


    @Override
    public void ucitaj() {
        DefaultListModel<Grupa> m = 
                new DefaultListModel<>();
        m.addAll(obrada.read((Smjer)cmbFilterSmjerovi.getSelectedItem()));
        lstPodaci.setModel(m);
        lstPodaci.repaint();
    }

    @Override
    public void napuniView() {
        var e = obrada.getEntitet();
        txtNaziv.setText(e.getNaziv());
        cmbSmjerovi.setSelectedItem(e.getSmjer());
        if(e.getPredavac()!=null){
            cmbPredavaci.setSelectedItem(e.getPredavac());
        }else{
            cmbPredavaci.setSelectedIndex(0);
        }
        if(e.getDatumPocetka()!=null){
             LocalDate ld = e.getDatumPocetka()
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        dpDatumPocetka.setDate(ld);
        }else{
            dpDatumPocetka.setDate(null);
        }
       
        
        DefaultListModel<Polaznik> m = new DefaultListModel<>();
        if(e.getPolaznici()!=null){
            m.addAll(e.getPolaznici());
        }
        lstPolazniciNaGrupi.setModel(m);
        lstPolazniciNaGrupi.repaint();
        
        
    }

    @Override
    public void napuniModel() {
        var e = obrada.getEntitet();
        e.setNaziv(txtNaziv.getText());
        e.setSmjer((Smjer) cmbSmjerovi.getSelectedItem());
        e.setPredavac((Predavac) cmbPredavaci.getSelectedItem());
        e.setDatumPocetka(dpDatumPocetka.getDate()!=null
                            ? 
                            Date.from(dpDatumPocetka.getDate()
                            .atStartOfDay()
                            .atZone(ZoneId.systemDefault())
                            .toInstant())
                            : null);
        
        List<Polaznik> polaznici = new ArrayList<>();
        try {
            DefaultListModel<Polaznik> m = (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
            for(int i=0;i<m.getSize();i++){
                polaznici.add(m.getElementAt(i));
            }
        } catch (Exception ex) {
            
        }
        e.setPolaznici(polaznici);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajPolaznika;
    private javax.swing.JButton btnObrisiPolaznika;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Smjer> cmbFilterSmjerovi;
    private javax.swing.JComboBox<Predavac> cmbPredavaci;
    private javax.swing.JComboBox<Smjer> cmbSmjerovi;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPocetka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Grupa> lstPodaci;
    private javax.swing.JList<Polaznik> lstPolazniciNaGrupi;
    private javax.swing.JList<Polaznik> lstPolazniciUBazi;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
