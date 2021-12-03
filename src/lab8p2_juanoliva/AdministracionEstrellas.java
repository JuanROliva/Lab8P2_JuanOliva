package lab8p2_juanoliva;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministracionEstrellas {
    private ArrayList<Estrella> estrellas = new ArrayList<Estrella>();
    private File archivo;

    public AdministracionEstrellas(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> estrellas) {
        this.estrellas = estrellas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setEstrella(Estrella e){
        estrellas.add(e);
    }
    
    public void cargarArchivo(){
        try {
            estrellas = new ArrayList();
            Estrella temp = null;
            if (archivo.exists()) {
                FileInputStream entreda = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entreda);
                try {
                    while ((temp = (Estrella) objeto.readObject())!=null) {
                        estrellas.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entreda.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(bw);
            for (Estrella e : estrellas) {
                bw.writeObject(e);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
