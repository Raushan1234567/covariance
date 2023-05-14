package Q4;

public class Data {
private int intVar;
private float Floatvar;
private String StringVar;
public Data(int intVar, float floatvar, String stringVar) {
	super();
	this.intVar = intVar;
	Floatvar = floatvar;
	StringVar = stringVar;
}
public int getIntVar() {
	return intVar;
}
public void setIntVar(int intVar) {
	this.intVar = intVar;
}
public float getFloatvar() {
	return Floatvar;
}
public void setFloatvar(float floatvar) {
	Floatvar = floatvar;
}
public String getStringVar() {
	return StringVar;
}
public void setStringVar(String stringVar) {
	StringVar = stringVar;
}
@Override
public String toString() {
	return "Data [intVar=" + intVar + ", Floatvar=" + Floatvar + ", StringVar=" + StringVar + "]";
}


}
