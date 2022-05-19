package mensajes_app;

public class mensaje {
	int ID_MENSAJE;
	String MENSAJE;
	String AUTOR_MENSAJE;
	String FECHA_MENSAJE;
	
	
	
	public mensaje() {
		
	}
	public mensaje(String MENSAJE, String AUTOR_MENSAJE, String FECHA_MENSAJE) {
		this.MENSAJE = MENSAJE;
		this.AUTOR_MENSAJE = AUTOR_MENSAJE;
		this.FECHA_MENSAJE = FECHA_MENSAJE;
	}
	
	public int getID_MENSAJE() {
		return ID_MENSAJE;
	}
	public void setID_MENSAJE(int iD_MENSAJE) {
		ID_MENSAJE = iD_MENSAJE;
	}
	public String getMENSAJE() {
		return MENSAJE;
	}
	public void setMENSAJE(String mENSAJE) {
		MENSAJE = mENSAJE;
	}
	public String getAUTOR_MENSAJE() {
		return AUTOR_MENSAJE;
	}
	public void setAUTOR_MENSAJE(String aUTOR_MENSAJE) {
		AUTOR_MENSAJE = aUTOR_MENSAJE;
	}
	public String getFECHA_MENSAJE() {
		return FECHA_MENSAJE;
	}
	public void setFECHA_MENSAJE(String fECHA_MENSAJE) {
		FECHA_MENSAJE = fECHA_MENSAJE;
	}
	
	
}
