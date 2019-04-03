
public class CPU {

	//atributos 
	
			String Marca;
			String Modelo;
			int memoria;
			
		//constructor CPU
			
			public CPU() {
				super();
				
				this.Marca="";
				this.Modelo="";
				this.memoria=memoria;
			}

		//constructor normal
			
			public CPU(String marca, String modelo, int memoria) {
				super();
				Marca = marca;
				Modelo = modelo;
				this.memoria = memoria;
			}

		//getters y setters
			
			public String getMarca() {
				return Marca;
			}

			public void setMarca(String marca) {
				Marca = marca;
			}

			public String getModelo() {
				return Modelo;
			}

			public void setModelo(String modelo) {
				Modelo = modelo;
			}

			public int getMemoria() {
				return memoria;
			}

			public void setMemoria(int memoria) {
				this.memoria = memoria;
			}

			//to string
			
			@Override
			public String toString() {
				return "CPU [Marca=" + Marca + ", Modelo=" + Modelo + ", memoria=" + memoria + "]";
			}
			
			//metodos
			
			public String MostarCPU() {
				return "CPU [Marca=" + Marca + ", Modelo=" + Modelo + ", memoria=" + memoria + "]";
			}
			
}
