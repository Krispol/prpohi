public class Sisend{
	static int summa = 0;
	public static void main(String[] argumendid){
		System.out.println("Argumente: "+argumendid.length);
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i]);
		}
		
		for(int i=0; i<argumendid.length; i++){
			System.out.println(argumendid[i].substring(0, 1)+" "+
				argumendid[i].length());
				summa+= argumendid[i].length();
				
		}
		//kuvage argumentides olevate sõnade tähtede arvu summa
		System.out.println("Tähemärkide kogus on " +summa);
	}
}