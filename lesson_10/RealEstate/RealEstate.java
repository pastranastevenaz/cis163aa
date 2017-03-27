
import java.util.*;
/**
* <h1>RealEstate/h1>
* <p>This class is the template for the RealEstate object. It contains all it's
* properties and mutators. s</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-27
*/
public class RealEstate{
  @Override
  public String toString(){
    return(this.location+" | "+this.price+" | "+this.description);
  }
  private String location;
  private int price;
  private String description;
  public RealEstate(String a, int b, String c){
    this.location = a;
    this.price = b;
    this.description=c;
  }
  public void setLocation(String loc){
    this.location=loc;
  }
  public String getLocation(){
    return this.location;
  }
  public void setPrice(int pric){
    this.price = pric;
  }
  public int getPrice(){
    return this.price;
  }
  public void setDescription(String desc){
    this.description=desc;
  }
  public String getDescription(){
    return this.description;
  }

  public static Comparator<RealEstate> realEstateLocationComparator = new Comparator<RealEstate>(){
    public int compare(RealEstate r1, RealEstate r2){
      String RealEstateLocation1 = r1.getLocation().toUpperCase();
      String RealEstateLocation2 = r2.getLocation().toUpperCase();

      return RealEstateLocation1.compareTo(RealEstateLocation2);
    }
  };

  public static Comparator<RealEstate> realEstatePriceComparator = new Comparator<RealEstate>(){
    public int compare(RealEstate r1, RealEstate r2){
      // int RealEstatePrice1 = r1.getPrice();
      // int RealEstatePrice2 = r2.getPrice();

      return (r1.getPrice() - r2.getPrice());
    }
  };

  public static Comparator<RealEstate> realEstateDescriptionComparator = new Comparator<RealEstate>(){
    public int compare(RealEstate r1, RealEstate r2){
      String RealEstateDescription1 = r1.getDescription();
      String RealEstateDescription2 = r2.getDescription();

      return RealEstateDescription1.compareTo(RealEstateDescription2);
    }
  };
}
