
public class PenAdaptoar implements Pen{
	PilotPen pp=new PilotPen();
	MarkerPen pp2=new MarkerPen();
	@Override
	public void Write(String str) {
		pp.mark(str);
		pp2.mark(str);
	}

}
