package simula.model.city

object CityWithAreaBuilder extends CityBuilderInterface{
	def CityBuilder():CityAccess={
	  var c:CityAccess= new City(new Size(10,10));
	  c.constructAnArea(new Location(1,1));
	  return c;
	}
}