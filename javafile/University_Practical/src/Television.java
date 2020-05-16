
public class Television {
	String brandName;
	boolean powerState;
	int channelNumber;
	int sound;
	double screenSize;

	//setters
	void setScreen(double s){
		screenSize=s;
	}
	void increaseSound(int s){
		sound +=s;
	}
	void  setChannalNumber(int number){
		channelNumber=number;
	}
	void setPowerState(boolean b){
		powerState=b;
	}
	void setbrand(String s){
		brandName=s;
	}


	//getters
	String getBarndName(){
		return brandName;
	}
	double getScreenSize(){
		return screenSize;
	}
	int getChannelNumber(){
		return channelNumber;
	}
	int getSound(){
		return sound;
	}
	boolean getPowerstate(){
		return powerState;
	}

}
