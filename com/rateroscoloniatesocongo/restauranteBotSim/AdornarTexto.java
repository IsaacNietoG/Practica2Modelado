package com.rateroscoloniatesocongo.restauranteBotSim;
public class AdornarTexto{
	private String texto;

	public AdornarTexto(String t){
	   asignarTexto(t);
	}

	public void asignarTexto(String t){
		this.texto = t;
	}
    /**
     *@return temporal
     */
	public String ponerContorno(String contorno){
      String temporal = this.texto.trim();
      int longitudCadena = temporal.length();
      contorno = contorno.trim();
      temporal = contorno + " " + this.texto + " " + contorno;
      String margen = "";
      for(int i = 0; i< longitudCadena + 4; i++){
         margen += contorno;    
      }
      temporal = margen + "\n" + temporal + "\n" + margen;  	
      return temporal;       
	}
    /**
     *@return temporal
     */
	public String ponerContornoADosTextos(String texto,String contorno){
     String temporal = this.texto.trim();
     String temporal2 = texto.trim();
     int longitudCadena1 = temporal.length();
     int longitudCadena2 = temporal2.length();
     contorno = contorno.trim();
     temporal = contorno + " " + this.texto + " " + contorno + "   " + contorno + " " + texto + " " + contorno;
     String margen = "";
     for(int i = 0; i<longitudCadena1+4;i++){
        margen += contorno;
     }
     margen += "   ";
     for(int j = 0; j<longitudCadena2+4;j++){
     	  margen += contorno;
     }
     temporal = margen + "\n" + temporal + "\n" + margen;
     return temporal;
	}

}
