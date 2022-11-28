/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.opcionesMedico;

import Base_de_datos.DAO_MEDICAMENTOS_SQL;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import modelo.Objetos.Medicamentos;
import modelo.Objetos.Medicamento;

/**
 *
 * @author Alvaro
 */
public class Medicamento_lista extends javax.swing.JFrame {
    private Medicamentos medicamentos;
    private JFrame frameAnterior;
    

    
    public Medicamento_lista(JFrame frameAnterior, String nombre) {
        DAO_MEDICAMENTOS_SQL dao=new DAO_MEDICAMENTOS_SQL();
        initComponents();
        String busqueda= nombre;
        this.medicamentos = new Medicamentos();
        this.frameAnterior = frameAnterior;
        
       
       Medicamento aux= medicamentos.getMedicamento(busqueda);
        Panel1.setText(dao.enfermedades_que_cura(busqueda));
        Panel2.setText(dao.alergias(busqueda));
        Panel3.setText(dao.efectos_secundarios(busqueda));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAlergias = new javax.swing.JLabel();
        botonVolver1 = new javax.swing.JButton();
        labelEfectos = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelLista = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Panel1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Panel3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAlergias.setText("Posibles alergias:");

        botonVolver1.setText("Volver");
        botonVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolver1ActionPerformed(evt);
            }
        });

        labelEfectos.setText("Efectos secundarios:");

        labelNombre.setText("Nombre medicamento");

        labelLista.setText("Lista de enfermedades que cura");

        Panel1.setColumns(20);
        Panel1.setRows(5);
        jScrollPane4.setViewportView(Panel1);

        Panel2.setColumns(20);
        Panel2.setRows(5);
        jScrollPane1.setViewportView(Panel2);

        Panel3.setColumns(20);
        Panel3.setRows(5);
        jScrollPane5.setViewportView(Panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(labelNombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEfectos)
                            .addComponent(labelAlergias))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelNombre)
                .addGap(79, 79, 79)
                .addComponent(labelLista)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(botonVolver1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(labelAlergias))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(labelEfectos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolver1ActionPerformed
        this.setVisible(false);
        frameAnterior.setVisible(true);
    }//GEN-LAST:event_botonVolver1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Panel1;
    private javax.swing.JTextArea Panel2;
    private javax.swing.JTextArea Panel3;
    private javax.swing.JButton botonVolver1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelAlergias;
    private javax.swing.JLabel labelEfectos;
    private javax.swing.JLabel labelLista;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
