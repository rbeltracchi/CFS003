package vistas;

import com.cfs3.proyectopets.MascotaCtr;
import com.cfs3.proyectopets.MascotaDto;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class CargaMascota extends javax.swing.JFrame {

    private String sexo;
    private String color = "";
    private String idMascotaV;
    private MascotaDto masco1=new MascotaDto();
    private MascotaCtr controlM;
   
    public CargaMascota(String idMasco1) {
        initComponents();
        this.idMascoV.setText(idMasco1);//muestra el valor de IdMascota

    }

    public CargaMascota() {

    }
    public MascotaDto getMasco(){
        return masco1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        buttonGroupColor = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jCheckBoxMacho = new javax.swing.JCheckBox();
        jCheckBoxHembra = new javax.swing.JCheckBox();
        jBcancelar = new javax.swing.JButton();
        jmodificar = new javax.swing.JButton();
        colorMarron = new javax.swing.JCheckBox();
        colorGris = new javax.swing.JCheckBox();
        colorNegro = new javax.swing.JCheckBox();
        colorBlanco = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        idMascoV = new javax.swing.JTextField();
        imagenM = new javax.swing.JLabel();
        jBotonSubirImagen = new javax.swing.JButton();
        rutaImagen = new javax.swing.JTextField();
        jBenviar = new javax.swing.JButton();
        jbotonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 6, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carga de Mascotas");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        nombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombre.setText("nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tipo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Color");

        tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Perro", "Gato", "Tortuga", "Exótico" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        buttonGroupSexo.add(jCheckBoxMacho);
        jCheckBoxMacho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBoxMacho.setText("Macho");
        jCheckBoxMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMachoMouseClicked(evt);
            }
        });

        buttonGroupSexo.add(jCheckBoxHembra);
        jCheckBoxHembra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBoxHembra.setText("Hembra");
        jCheckBoxHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxHembraMouseClicked(evt);
            }
        });

        jBcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBcancelar.setText("Cancelar");
        jBcancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBcancelarMouseClicked(evt);
            }
        });
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });

        jmodificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jmodificar.setText("Modificar");
        jmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmodificarActionPerformed(evt);
            }
        });

        colorMarron.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colorMarron.setText("Marron");
        colorMarron.setActionCommand("");
        colorMarron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorMarronActionPerformed(evt);
            }
        });

        colorGris.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colorGris.setText("Gris");
        colorGris.setActionCommand("");
        colorGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorGrisActionPerformed(evt);
            }
        });

        colorNegro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colorNegro.setText("Negro");
        colorNegro.setActionCommand("");
        colorNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorNegroActionPerformed(evt);
            }
        });

        colorBlanco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        colorBlanco.setText("Blanco");
        colorBlanco.setActionCommand("");
        colorBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlancoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Id Mascota");

        idMascoV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idMascoV.setText("idMascoV");
        idMascoV.setToolTipText("");
        idMascoV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMascoVActionPerformed(evt);
            }
        });

        imagenM.setText("Foto Mascota");
        imagenM.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 255), java.awt.Color.lightGray, new java.awt.Color(204, 204, 255), new java.awt.Color(102, 102, 255)));

        jBotonSubirImagen.setText("subir imagen");
        jBotonSubirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSubirImagenActionPerformed(evt);
            }
        });

        rutaImagen.setText("Ruta imagen");
        rutaImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaImagenActionPerformed(evt);
            }
        });

        jBenviar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBenviar.setText("Enviar");
        jBenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBenviarActionPerformed(evt);
            }
        });

        jbotonBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbotonBuscar.setText("Buscar");
        jbotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(idMascoV, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxMacho)
                            .addComponent(colorBlanco))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(colorNegro)
                                .addGap(35, 35, 35)
                                .addComponent(colorMarron)
                                .addGap(18, 18, 18)
                                .addComponent(colorGris))
                            .addComponent(jCheckBoxHembra))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenM, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jBenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonSubirImagen)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idMascoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(colorGris)
                                    .addComponent(colorNegro)
                                    .addComponent(colorMarron)
                                    .addComponent(colorBlanco))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imagenM, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxHembra)
                            .addComponent(jCheckBoxMacho))))
                .addGap(18, 18, 18)
                .addComponent(jBotonSubirImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBenviar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );

        imagenM.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        // Cancelar, sale de la pantalla:
        this.dispose();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmodificarActionPerformed
        //muestra el objeto mascota  a modificar 
        String idS = idMascoV.getText();        
        int id = Integer.parseInt(idS);
        this.idMascoV.setEditable(false);
        System.out.println("mascota a modificar y buscar "+id);
        masco1=controlM.buscarMascota(1);//recupera mascota de la BD
        System.out.println(masco1.toString());
        this.nombre.setText(masco1.getNombre());
        this.tipo.setSelectedItem(masco1.getTipo());
        
        if (masco1.getColor().contains("gris")){
            this.colorGris.setSelected(true);
        }
        else{
            this.colorGris.setSelected(false);
        }
        if (masco1.getColor().contains("negro")){
            this.colorNegro.setSelected(true);
        }
        else{
            this.colorNegro.setSelected(false);
        }
        if (masco1.getColor().contains("blanco")){
            this.colorBlanco.setSelected(true);
        }
        else{
            this.colorBlanco.setSelected(false);
        }
        if (masco1.getColor().contains("marron")){
            this.colorMarron.setSelected(true);
        }
        else{
            this.colorMarron.setSelected(false);
        }
        if (masco1.getSexo()=="hembra"){
            this.jCheckBoxHembra.setSelected(true);
            this.jCheckBoxMacho.setSelected(false);
        } 
        else{
            this.jCheckBoxHembra.setSelected(false);
            this.jCheckBoxMacho.setSelected(true);
        }
        
        this.rutaImagen.setText(masco1.getNombImagen());
        
        this.imagenM.setIcon(new ImageIcon(masco1.getImagen()));//guarda ruta imagen
        
        String t = String.valueOf(tipo.getSelectedItem());
        
        //guarda los campos del formulario en objeto mascota
        masco1.setIdMascota(id);
        masco1.setNombre(nombre.getText());
        masco1.setColor(this.color);
        masco1.setSexo(this.sexo);
        masco1.setTipo(t);
        masco1.setNombImagen(this.rutaImagen.getText());
        
        //convertir archivo de imagen
        FileInputStream imagenMasco=null; 
        try {
            imagenMasco = new FileInputStream(rutaImagen.getText()); //convertir imagen para guardar
            } catch (FileNotFoundException ex) {
            Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1000000];
        try {
            for (int readNum; (readNum = imagenMasco.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //lee una cantidad de bytes buf y los guarda en bos
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] bytes = bos.toByteArray();//convierte a ByteArray
        //guarda imagen en objeto
        masco1.setImagen(bytes);
         
        System.out.println("modificacion mascota"+id + nombre.getText() + t + color + sexo + rutaImagen.getText() + bytes);
        controlM.modificarMascotaBD(masco1);
        JOptionPane.showMessageDialog(null, "El registro de mascota se ha guadado.");
        //mandar masco1 a la base de datos para actualizar
    }//GEN-LAST:event_jmodificarActionPerformed

    private void jCheckBoxMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMachoMouseClicked
        // guarda el valor de la etiqueta, macho.
        sexo = jCheckBoxMacho.getText();
    }//GEN-LAST:event_jCheckBoxMachoMouseClicked

    private void jCheckBoxHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxHembraMouseClicked
        // guarda el valor de la etiqueta, hembra.
        sexo = jCheckBoxHembra.getText();
    }//GEN-LAST:event_jCheckBoxHembraMouseClicked

    private void jBcancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBcancelarMouseClicked
        // Cancelar, sale de la pantalla:
        this.dispose();
    }//GEN-LAST:event_jBcancelarMouseClicked

    private void colorBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlancoActionPerformed
        // agrega color seleccionardo al String color
        color = color + colorBlanco.getText() + " ";
    }//GEN-LAST:event_colorBlancoActionPerformed

    private void colorMarronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorMarronActionPerformed
        // agrega color seleccionardo al String color
        color = color + colorMarron.getText() + " ";
    }//GEN-LAST:event_colorMarronActionPerformed

    private void colorGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorGrisActionPerformed
        // agrega color seleccionardo al String color
        color = color + colorGris.getText() + " ";
    }//GEN-LAST:event_colorGrisActionPerformed

    private void colorNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorNegroActionPerformed
        // agrega color seleccionardo al String color
        color = color + colorNegro.getText() + " ";
    }//GEN-LAST:event_colorNegroActionPerformed

    private void idMascoVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMascoVActionPerformed
        // si idMascoV existe, se modific
        this.idMascoV.setVisible(true);
        masco1=controlM.buscarMascotaBD(Integer.parseInt(idMascoV.getText()));
        if (masco1==null){
             this.limpiarForm();
             this.idMascotaV=String.valueOf(idMascoV);
          }         
    }//GEN-LAST:event_idMascoVActionPerformed

    private void jBotonSubirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSubirImagenActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();//permite seleccionar imagen
        fc.setDialogTitle("Elegir imagen");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            //Icon archivo= new ImageIcon(fc.getSelectedFile().toString());//
            File archivoIm = fc.getSelectedFile();//guarda ruta imagen
            subirImagen(archivoIm);
        }
    }//GEN-LAST:event_jBotonSubirImagenActionPerformed
    private void subirImagen(File archivoIm) {
        //sube una imagen desde la computadora, y la muestra en pantalla.

        rutaImagen.setText(String.valueOf(archivoIm));//imprime ruta imagen en pantalla
        Image fotoMasco = getToolkit().getImage(rutaImagen.getText());//guarda imagen
        fotoMasco = fotoMasco.getScaledInstance(210, 210, Image.SCALE_DEFAULT);//escala la imagen a la ventana
        imagenM.setIcon(new ImageIcon(fotoMasco));
    }
    private void rutaImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaImagenActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void jBenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBenviarActionPerformed
        //agrega un registro a la base de datos de Mascotas
        String idS = idMascoV.getText();
        int id = Integer.parseInt(idS);
        String t = String.valueOf(tipo.getSelectedItem());
        //convertir archivo de imagen
        FileInputStream imagenMasco=null; 
        try {
            imagenMasco = new FileInputStream(rutaImagen.getText()); //convertir imagen para guardar
            } catch (FileNotFoundException ex) {
            Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1000000];
        try {
            for (int readNum; (readNum = imagenMasco.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //lee una cantidad de bytes buf y los guarda en bos
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] bytes = bos.toByteArray();//convierte a ByteArray
        masco1 = new MascotaDto(id, nombre.getText(), t, color, sexo, rutaImagen.getText(), bytes);
        System.out.println(id + nombre.getText() + t + color + sexo + rutaImagen.getText() + bytes);
        JOptionPane.showMessageDialog(null, "El registro de mascota se agregará.");
        controlM.guardarMascotaBD(masco1);
    }//GEN-LAST:event_jBenviarActionPerformed

    private void jbotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonBuscarActionPerformed
        // 
        //muestra el objeto mascota solicitado
        String idS = idMascoV.getText();        
        int id = Integer.parseInt(idS);
        this.idMascoV.setEditable(false);
        System.out.println("mascota a modificar y buscar "+id);
        masco1=controlM.buscarMascota(id);//recupera mascota de la BD
        System.out.println("mascota a modificar y buscar "+masco1.toString());
        this.nombre.setText(masco1.getNombre());
        this.tipo.setSelectedItem(masco1.getTipo());
        
        if (masco1.getColor().contains("gris")){
            this.colorGris.setSelected(true);
        }
        else{
            this.colorGris.setSelected(false);
        }
        if (masco1.getColor().contains("negro")){
            this.colorNegro.setSelected(true);
        }
        else{
            this.colorNegro.setSelected(false);
        }
        if (masco1.getColor().contains("blanco")){
            this.colorBlanco.setSelected(true);
        }
        else{
            this.colorBlanco.setSelected(false);
        }
        if (masco1.getColor().contains("marron")){
            this.colorMarron.setSelected(true);
        }
        else{
            this.colorMarron.setSelected(false);
        }
        if (masco1.getSexo()=="hembra"){
            this.jCheckBoxHembra.setSelected(true);
            this.jCheckBoxMacho.setSelected(false);
        } 
        else{
            this.jCheckBoxHembra.setSelected(false);
            this.jCheckBoxMacho.setSelected(true);
        }
        
        this.rutaImagen.setText(masco1.getNombImagen());
        
        this.imagenM.setIcon(new ImageIcon(masco1.getImagen()));//guarda ruta imagen
        
        String t = String.valueOf(tipo.getSelectedItem());
        
        //guarda los campos del formulario en objeto mascota
        masco1.setIdMascota(id);
        masco1.setNombre(nombre.getText());
        masco1.setColor(this.color);
        masco1.setSexo(this.sexo);
        masco1.setTipo(t);
        masco1.setNombImagen(this.rutaImagen.getText());
        
        //convertir archivo de imagen
        FileInputStream imagenMasco=null; 
        try {
            imagenMasco = new FileInputStream(rutaImagen.getText()); //convertir imagen para guardar
            } catch (FileNotFoundException ex) {
            Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1000000];
        try {
            for (int readNum; (readNum = imagenMasco.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); //lee una cantidad de bytes buf y los guarda en bos
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
        byte[] bytes = bos.toByteArray();//convierte a ByteArray
        //guarda imagen en objeto
        masco1.setImagen(bytes);
        
                      
    }//GEN-LAST:event_jbotonBuscarActionPerformed
    private void limpiarForm(){
        //limpia los campos del formulario
        this.nombre.setText("");
        this.tipo.setSelectedItem("");
        this.colorBlanco.setSelected(false);
        this.colorGris.setSelected(false);
        this.colorMarron.setSelected(false);
        this.colorNegro.setSelected(false);
        this.jCheckBoxHembra.setSelected(false);
        this.jCheckBoxMacho.setSelected(false);
        this.rutaImagen.setText("");
        this.imagenM=null;        
    }
    public static void main(String idMascota) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CargaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("id masco" + idMascota);
                new CargaMascota(idMascota).setVisible(true);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CargaMascota.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroupColor;
    public static javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JCheckBox colorBlanco;
    private javax.swing.JCheckBox colorGris;
    private javax.swing.JCheckBox colorMarron;
    private javax.swing.JCheckBox colorNegro;
    private javax.swing.JTextField idMascoV;
    private javax.swing.JLabel imagenM;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBenviar;
    private javax.swing.JButton jBotonSubirImagen;
    private javax.swing.JCheckBox jCheckBoxHembra;
    private javax.swing.JCheckBox jCheckBoxMacho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbotonBuscar;
    private javax.swing.JButton jmodificar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rutaImagen;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
