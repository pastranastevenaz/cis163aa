/**
* <h1>Sandwich</h1>
* <p>This file is a class file for the sandwich template. It will be used by the TestSandwich file.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-14
*/
public class Sandwich{
		private String mainIngredient;
		private String breadType;
		private double price;

		public Sandwich(){
			mainIngredient = "turkey";
			breadType = "rye";
			price = 5.99;
		}

		public void setMainIngredient(String ingredient){
				mainIngredient = ingredient;
		}
		public String getMainIngredient(){
			return mainIngredient;
		}
		public void setBreadType(String bread){
			breadType = bread;
		}
		public String getBreadType(){
			return breadType;
		}
		public void setPrice(double sandwichPrice){
			price = sandwichPrice;
		}
		public double getPrice(){
			return price;
		}
}
