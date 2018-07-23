
package vistas;

import com.cfs3.proyectopets.FichaDto;
import com.cfs3.proyectopets.MascotaDto;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Mostrar extends javax.swing.JFrame {
    
    List<MascotaDto> lMasco;
    List<Image> listaFotos;
    int paginas=0;
    int contador=0;
    int cantFotos;

  
    public Mostrar(String titulo) {
        initComponents();
        setTitle("titulo");
        
        /*
        try {

             StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                     .configure()
                     .build();
            try {
                 //lee mascotas de la base de datos
                 SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                 Session session = sessionFactory.openSession();
                 session.beginTransaction();
                 Query q= session.createQuery("from MascotaDto");//busca todas las mascotas de la BD   
                 this.lMasco=q.list();
                 List<MascotaDto>l=q.list();
                 for (MascotaDto mas : l) {
                 System.out.println(mas.getNombre()+" "+mas.getColor()+" "+mas.getSexo()+" "+mas.getTipo());
                 }
                 this.listaFotos=byteToImage(this.lMasco);
                 this.cantFotos=lMasco.size();
                 session.getTransaction().commit();
                 session.close();
                 sessionFactory.close();
                } catch (Exception e) {
                  e.printStackTrace();
                 }
          } catch (Exception e) {
              e.printStackTrace();
        }
        
      JOptionPane.showMessageDialog(null,"Se han cargado las mascotas en Mostrar()");
      */
    }
    
    public void setListaMascotas(List<MascotaDto> masco){
        this.lMasco=masco;
    }
    public List<MascotaDto> getlistMascotas(){
        return this.lMasco;
    } 
    public void setListaFotos(){
        List<Image> listaFotos=byteToImage(lMasco);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton22.setText(">");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton33.setText("<");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jLabel2.setText("img");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("img");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("img");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("img");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("img");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\ProyectoPets-rompi\\ProyectoPets-con BD\\src\\main\\java\\imagenes\\cachorro1.jpg")); // NOI18N
        jLabel1.setText("Img");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentShown(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("img");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setBackground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("img");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        int aux;
        if (this.contador==this.paginas){
            contador=1;
        }
        aux=(contador-1)*8;
        System.out.println("contador: "+contador+"paginas: "+paginas+"aux "+aux);
        jLabel1.setIcon(new ImageIcon(listaFotos.get(0+aux)));
        jLabel2.setIcon(new ImageIcon(listaFotos.get(1+aux)));
        jLabel3.setIcon(new ImageIcon(listaFotos.get(2+aux)));
        jLabel4.setIcon(new ImageIcon(listaFotos.get(3+aux)));
        jLabel5.setIcon(new ImageIcon(listaFotos.get(4+aux)));
        jLabel6.setIcon(new ImageIcon(listaFotos.get(5+aux)));
        jLabel7.setIcon(new ImageIcon(listaFotos.get(6+aux)));
        jLabel8.setIcon(new ImageIcon(listaFotos.get(7+aux)));
        contador++;
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        int aux=0;
        if(contador==1){
            contador=this.paginas;
        }
        aux=(contador-1)*8;
        System.out.println("contador: "+contador+"paginas: "+paginas+"aux "+aux);
        jLabel1.setIcon(new ImageIcon(listaFotos.get(0+aux)));
        jLabel2.setIcon(new ImageIcon(listaFotos.get(1+aux)));
        jLabel3.setIcon(new ImageIcon(listaFotos.get(2+aux)));
        jLabel4.setIcon(new ImageIcon(listaFotos.get(3+aux)));
        jLabel5.setIcon(new ImageIcon(listaFotos.get(4+aux)));
        jLabel6.setIcon(new ImageIcon(listaFotos.get(5+aux)));
        jLabel7.setIcon(new ImageIcon(listaFotos.get(6+aux)));
        jLabel8.setIcon(new ImageIcon(listaFotos.get(7+aux)));
        contador--;
    
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jLabel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentShown
          
    }//GEN-LAST:event_jLabel1ComponentShown
    public void MostrarMascotasenPantalla(){
     try {

             StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                     .configure()
                     .build();
            try {
                 //lee mascotas de la base de datos
                 SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                 Session session = sessionFactory.openSession();
                 session.beginTransaction();
                 System.out.println("pasó por encontrados en BD");
                 Query q= session.createQuery("from MascotaDto where tipo=(:valor1) or tipo=(:valor2)");//falta buscar en ficha    
                 q.setParameter("valor1","gato");
                 q.setParameter("valor2","perro");
                 this.lMasco=q.list();
                 for (MascotaDto mas : this.lMasco) {
                 System.out.println(mas.getNombre()+" "+mas.getColor()+" "+mas.getSexo()+" "+mas.getTipo());
                 }
                 this.visualizar(0);
                 
                 session.getTransaction().commit();
                 session.close();
                 sessionFactory.close();
                } catch (Exception e) {
                  e.printStackTrace();
                 }
          } catch (Exception e) {
              e.printStackTrace();
        }
      JOptionPane.showMessageDialog(null,"Los registros de Mascotas encontradas se han mostrado");
      
    }
    public void visualizar(int indice){
      int cantMasco=1, paginas=1;
      
      while ((cantMasco>0)&&(indice<cantMasco)){
          cantMasco=listaFotos.size()-indice;
          System.out.println("ingresa a visualizar con fotos: "+cantMasco);
       if (cantMasco>=8){
           //cargar las 8 imagenes en el visor
           System.out.println("pasa por mas de 8 fotos con cantMasco: "+cantMasco+"indice: "+indice+"pagina: "+paginas);
           jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));
           jLabel2.setIcon(new ImageIcon(listaFotos.get(indice+1)));
           jLabel3.setIcon(new ImageIcon(listaFotos.get(indice+2)));
           jLabel4.setIcon(new ImageIcon(listaFotos.get(indice+3)));
           jLabel5.setIcon(new ImageIcon(listaFotos.get(indice+4)));
           jLabel6.setIcon(new ImageIcon(listaFotos.get(indice+5)));
           jLabel7.setIcon(new ImageIcon(listaFotos.get(indice+6)));
           jLabel8.setIcon(new ImageIcon(listaFotos.get(indice+7)));
           indice=+8;
           paginas++;
       }
       else{//hay menos de 8 fotos
           System.out.println("pasa por switch con cantMasco: "+cantMasco+"indice: "+indice+"pagina: "+paginas);
           switch (cantMasco){
           case 1:
           {jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));break;}
           case 2:
           {jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));
            jLabel2.setIcon(new ImageIcon(listaFotos.get(indice+1)));break;
            }
           case 3:
           {jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));
            jLabel2.setIcon(new ImageIcon(listaFotos.get(indice+1)));
            jLabel3.setIcon(new ImageIcon(listaFotos.get(indice+2)));break;
           }
           case 4:
           {jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));
            jLabel2.setIcon(new ImageIcon(listaFotos.get(indice+1)));
            jLabel3.setIcon(new ImageIcon(listaFotos.get(indice+2)));
            jLabel4.setIcon(new ImageIcon(listaFotos.get(indice+3)));break;
           }
           case 5:
           {jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));
           jLabel2.setIcon(new ImageIcon(listaFotos.get(indice+1)));
           jLabel3.setIcon(new ImageIcon(listaFotos.get(indice+2)));
           jLabel4.setIcon(new ImageIcon(listaFotos.get(indice+3)));
           jLabel5.setIcon(new ImageIcon(listaFotos.get(indice+4)));break;
           }
           case 6:
           {jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));
           jLabel2.setIcon(new ImageIcon(listaFotos.get(indice+1)));
           jLabel3.setIcon(new ImageIcon(listaFotos.get(indice+2)));
           jLabel4.setIcon(new ImageIcon(listaFotos.get(indice+3)));
           jLabel5.setIcon(new ImageIcon(listaFotos.get(indice+4)));
           jLabel6.setIcon(new ImageIcon(listaFotos.get(indice+5)));break;}
           case 7:
           {jLabel1.setIcon(new ImageIcon(listaFotos.get(indice)));
           jLabel2.setIcon(new ImageIcon(listaFotos.get(indice+1)));
           jLabel3.setIcon(new ImageIcon(listaFotos.get(indice+2)));
           jLabel4.setIcon(new ImageIcon(listaFotos.get(indice+3)));
           jLabel5.setIcon(new ImageIcon(listaFotos.get(indice+4)));
           jLabel6.setIcon(new ImageIcon(listaFotos.get(indice+5)));
           jLabel7.setIcon(new ImageIcon(listaFotos.get(indice+6)));break;}
           default:
           {System.out.println("Error en visor");break;}
           }//fin case
           indice=cantMasco;
           paginas++;
       }
      }
    } 
      
    public List<Image> byteToImage(List<MascotaDto> lM){
        //genera una lista de imagenes a partir de la lista de mascotas
    if (lM!=null){    
        List<Image>listIm=new ArrayList<>();
        Image fotoMasco;
        for(MascotaDto m:lM){
         if (m.getImagen()!=null){   
          fotoMasco = getToolkit().getImage(m.getNombImagen());//guarda imagen
          fotoMasco=fotoMasco.getScaledInstance(110, 110,Image.SCALE_DEFAULT);//escala la imagen a la ventana
          listIm.add(fotoMasco);
        }
        }
        return listIm;
    }
    else{
      System.out.println("La lista de imagenes está vacía.");  
      return null;
    }
    }
    
    
    
    public static void main(String titulo) {
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
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar("encontrados").setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton33;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}