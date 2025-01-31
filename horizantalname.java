class NameH{
    public static void main(String args[]) {
        int size=Integer.parseInt(args[0]);
        NameH p = new NameH();
        System.out.println("JASKIRAN");
      for(int line=1;line<=2*size+3;line++)
      {
      	System.out.print(p.displayPatternJ(line,size)+"  "+p.displayPatternA(line,size)+"  "+p.displayPatternS(line,size)+"  "+p.displayPatternK(line,size)+"  "+p.displayPatternI(line,size)+"  "+p.displayPatternR(line,size)+"  "+p.displayPatternA(line,size)+"  "+p.displayPatternN(line,size));
      	System.out.println();
      	
       
      }
        
}
String displayPatternJ(int line,int size) {
	String pattern="";
            if (line<=size+1) {
            if(line==1){
                for (int star = 1; star <=2 *size+3; star++) {
                    pattern+="*";
                }
            } else {
                for (int space = 1; space <=size+1; space++) {
                    pattern+=" ";
                }
                pattern+="*";
                for(int ospace=1;ospace<=size+1;ospace++){
                pattern+=" ";
                }
            }
            
            }
        
        else if(line!=2*size+3)
        {
        pattern+="*";
        for(int space=size;space>0;space--)
        {
        	pattern+=" ";
        }
        pattern+="*";
        for(int ospace=1;ospace<=size+1;ospace++){
                pattern+=" ";
                }
        
        
        }
   else
   {
   for(int star=1;star<=size+2;star++)
   {
   pattern+="*";
   }
    for(int ospace=1;ospace<=size+1;ospace++){
                pattern+=" ";
                }
   
   }
   return pattern;
   }
String displayPatternA(int line,int size){
String pattern="";
	if(line<=size+1){
		if(line==1){
			
			for(int star=1;star<=2*size+3;star++)
			{
				pattern+="*";
			}
		}
		
		else
		{
			pattern+="*";
			for(int space=1;space<=2*size+1;space++)
			{
				pattern+=" ";
			}
			pattern+="*";
		}
		
	}
	else
	{
		if(line==size+2)
		{
			for(int star=1;star<=2*size+3;star++)
			{
			pattern+="*";
			}
		}
		else
		{
		pattern+="*";
		for(int space=1;space<=2*size+1;space++)
			{
				pattern+=" ";
			}
			
			pattern+="*";
		}
			
	}
	return pattern;
}
String displayPatternS(int line,int size){
String pattern="";
	if(line<=size+1){
		if(line==1)
		{
			for(int star=1;star<=2*size+3;star++)
			{
				pattern+="*";
			}
		}
		else
		{
			pattern+="*";
			for(int ospace=1;ospace<=2*size+2;ospace++)
			{
				pattern+=" ";
			}
		}
		
	}
	else if(line==size+2)
	{
		for(int star=1;star<=2*size+3;star++)
		{
		pattern+="*";
		}
		
	}
	else
	{
		if(line<2*size+3)
		{
			for(int star=1;star<=2*size+2;star++){
				pattern+=" ";			
			}
			pattern+="*";
		}
		else
		{
			for(int space=1;space<=2*size+3;space++)
			{
			pattern+="*";
			}
		}
	}
	return pattern;
}
String displayPatternK(int line,int size) {
String pattern="";
	if(line<=size+1){
            pattern+="*";
            for(int space=line;space<=2*size+1;space++)
            {
            	pattern+=" ";
            }
            pattern+="*";
            for(int ospace=line-1;ospace>0;ospace--){
            	pattern+=" ";
            }
            
        }
        else if(line==size+2)
        {
        	for(int star=1;star<=size+2;star++)
        	{
        		pattern+="*";
        	}
        	for(int ospace=1;ospace<size+2;ospace++)
        	{
        		pattern+=" ";
        	}
        }
        else
        {
        	pattern+="*";
        	for(int space=2*size+4-line;space<=2*size+1;space++)
        	{
        		pattern+=" ";
        	}
        		pattern+="*";
        	for(int ospace=2*size+3-line;ospace>0;ospace--)
        	{
        		pattern+=" ";
        	}
         }
         return pattern;    
   }     
String displayPatternI(int line,int size)
{
String pattern="";
	if(line==1 || line==2*size+3)
	{
		for(int star=1;star<=2*size+3;star++)
		{
		pattern+="*";
		}
	}
	else
	{
		for(int space=line;space<=size+line;space++)
		{
		pattern+=" ";
		}
		pattern+="*";
		for(int space=line;space<=size+line;space++)
		{
		pattern+=" ";
		}
	}

	return pattern;
}
String displayPatternN(int line,int size){
String pattern="";
		pattern+="*";
		if(line==1||line==2*size+3)
		{
		for(int space=1;space<=2*size+1;space++)
		{
		pattern+=" ";
		}
		pattern+="*";
		}
		else
		{
		for(int space=line-2;space>0;space--)
		{
		pattern+=" ";
		}
		pattern+="*";
		for(int space=2*size-line+2;space>0;space--)
		{
		pattern+=" ";
		}
		pattern+="*";
	}
	
return pattern;
}
String displayPatternR(int line,int size){
String pattern="";
	if(line<=size+2){
	if(line==1||line==size+2)
	{
		for(int star=1;star<=2*size+3;star++)
		{
			pattern+="*";
		}
		pattern+="";
	}
	else
	{
		pattern+="*";
		for(int space=1;space<=2*size+1;space++)
		{
		pattern+=" ";
		}
		pattern+="*";
	}
	}
	else
	{
		pattern+="*";
		for(int space = 1; space <size+2; space++){
		pattern+=" ";
		}
		pattern+="*";
		for(int ospace=1;ospace<size+1;ospace++)
		{
		pattern+=" ";
		}
	}
	return pattern;
}
}
