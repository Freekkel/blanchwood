import java.util.ArrayList;

public class BasicLand extends Card {

	private ArrayList<String> typeBasicLand = new ArrayList<String>();
	private String basicLand = "Basic Land";
	private boolean isBasicLand = true;

	
	
	
	public BasicLand(String name, ArrayList<String> type,
			ArrayList<String> subtype, ArrayList<String> supertype,
			String zone, String edition, String artist, String anecdote,
			String textField, int collectorsNumber, boolean legendary,
			boolean permanent) {
		super(name, type, subtype, supertype, zone, edition, artist, anecdote,
				textField, collectorsNumber, legendary, permanent);
		typeBasicLand.add(basicLand);
		setType(typeBasicLand);
		
	
		if(name.equals("Forest")){
			addSubtypes("Forest");
		}else if(name.equals("Swamp")){
			addSubtypes("Swamp");
		}else if(name.equals("Plains")){
			
		}

	}

	
	
	
	public String produceMana() {

		for (int i = 0; i < subtype.size(); i++) {
			
		}
		return name;
	}


	
	public boolean isBasicLand() {
		return isBasicLand;
	}

	public void setBasicLand(boolean isBasicLand) {
		this.isBasicLand = isBasicLand;
	}

}
