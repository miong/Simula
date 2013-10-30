class GeneralScanner extends CriminalityScanner with NetworkScanner with PolutionScanner with PopulationScanner{
  
  private var model : Model = null
  private var engine : Engine = null
  
  def BuildScanner(m:Model,e:Engine):GeneralScanner = {
	  val gs : GeneralScanner = new GeneralScanner()
	  gs.model = m
	  gs.engine = e
	  return gs
	  
  }
  
  

}