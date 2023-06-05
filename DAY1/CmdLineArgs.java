class CmdLineArgs{
   public static void main(String args[]){
	   int s=0;
       for(int i=0;i<args.length;i++){
		   s=s+Integer.parseInt(args[i]);
	   }
	   System.out.println("Addition : "+s);
	   System.out.print("Addition : "+s);
	   System.out.printf("Addition: %d\n",s);
	   float x=123.45f;
	   float y=45678.56f;
	   System.out.printf("%8.2f\n",x);
	   System.out.printf("%8.2f\n",y);
   }
}