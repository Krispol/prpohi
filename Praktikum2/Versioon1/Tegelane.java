class Tegelane{
  int x, y;
  Tyyp tyyp;
  Suund suund;
  public Tegelane(){
    x=0; y=0;
    tyyp=Tyyp.MANGIJA;
    suund=Suund.PAREMALE;
  }
  public void liigu(){
    if(suund==Suund.PAREMALE){x++;}
  }
  public void muudaSuund(Suund uusSuund){this.suund=uusSuund;}
  public String toString(){
    return tyyp+" kohal "+x+", "+y+" suunaga "+suund;
  }
}
