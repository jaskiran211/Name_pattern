class Name{
    public static void main(String args[]) {
        int size=Integer.parseInt(args[0]);
        Name p = new Name();
        System.out.print("JASKIRAN");
        System.out.println();
        p.displayPatternJ(size);
        System.out.println();
        p.displayPatternA(size);
        System.out.println();
        p.displayPatternS(size);
        System.out.println();
        p.displayPatternK(size);
        System.out.println();
        p.displayPatternI(size);
        System.out.println();
        p.displayPatternR(size);
        System.out.println();
        p.displayPatternA(size);
        System.out.println();
        p.displayPatternN(size);   
    }
 void displayPatternJ(int size) {
        for (int line = 1; line <=size+1; line++) {
            if (line == 1) {
                for (int star = 1; star <=2 *size+3; star++) {
                    System.out.print("*");
                }
            } else {
                for (int space = 1; space <=size+1; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int ospace=1;ospace<=size+1;ospace++){
                System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int line=1;line<=size+1;line++)
        {
        System.out.print("*");
        for(int space=size;space>0;space--)
        {
        	System.out.print(" ");
        }
        System.out.print("*");
        for(int ospace=1;ospace<=size+1;ospace++){
                System.out.print(" ");
                }
        
        System.out.print("\n");
   }
   
   for(int line=1;line<2;line++)
   {
   System.out.print(" ");
   for(int star=1;star<=size+1;star++)
   {
   System.out.print("*");
   }
    for(int ospace=1;ospace<=size+1;ospace++){
                System.out.print(" ");
                }
   System.out.print("\n");
   }
   }
void displayPatternA(int size){
	for(int line=1;line<=size+1;line++)
	{
		if(line==1){
			System.out.print(" ");
			for(int star=1;star<=2*size+1;star++)
			{
				System.out.print("*");
			}
			System.out.print(" ");
		}
		else
		{
			System.out.print("*");
			for(int space=1;space<=2*size+1;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.print("\n");
	}
	for(int line=1;line<=size+2;line++)
	{
		if(line==1)
		{
			for(int star=1;star<=2*size+3;star++)
			{
			System.out.print("*");
			}
		}
		else
		{
		System.out.print("*");
		for(int space=1;space<=2*size+1;space++)
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
		}
		System.out.print("\n");	
	} 
}
void displayPatternS(int size){
	for(int line=1;line<=size+1;line++)
	{
		if(line==1)
		{
			System.out.print(" ");
			for(int star=1;star<=2*size+2;star++)
			{
				System.out.print("*");
			}
		}
		else
		{
			System.out.print("*");
			for(int ospace=1;ospace<=2*size+2;ospace++)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	for(int line=1;line<2;line++)
	{
		for(int star=1;star<=2*size+3;star++)
		{
		System.out.print("*");
		}
		System.out.print("\n");
	}
	for(int line=1;line<=size+1;line++)
	{
		if(line==size+1)
		{
			for(int star=1;star<=2*size+2;star++){
				System.out.print("*");			
			}
			System.out.print(" ");
		}
		else
		{
			for(int space=1;space<=2*size+2;space++)
			{
			System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.print("\n");
	}
}
void displayPatternK(int size) {
	for (int line = 1; line <= size+1; line++) {
            System.out.print("*");
            for(int space=line;space<=2*size+1;space++)
            {
            	System.out.print(" ");
            }
            System.out.print("*");
            for(int ospace=line-1;ospace>0;ospace--){
            	System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int line=1;line<2;line++)
        {
        	for(int star=1;star<=size+2;star++)
        	{
        		System.out.print("*");
        	}
        	for(int ospace=1;ospace<size+2;ospace++)
        	{
        		System.out.print(" ");
        	}
        	System.out.print("\n");	
        }
        for(int line=1;line<=size+1;line++)
        {
        	System.out.print("*");
        	for(int space=1;space<=size+line;space++)
        	{
        		System.out.print(" ");
        	}
        		System.out.print("*");
        	for(int ospace=2*size-line;ospace>0;ospace--)
        	{
        		System.out.print(" ");
        	}
        		System.out.print("\n");
         }
   }     
void displayPatternI(int size)
{
	for(int line=1;line<=2*size+3;line++)
	{
	if(line==1 || line==2*size+3)
	{
		for(int star=1;star<=2*size+3;star++)
		{
		System.out.print("*");
		}
	}
	else
	{
		for(int space=line;space<=size+line;space++)
		{
		System.out.print(" ");
		}
		System.out.print("*");
		for(int space=line;space<=size+line;space++)
		{
		System.out.print(" ");
		}
	}
	System.out.print("\n");
	}
}
void displayPatternN(int size){
	for(int line=1;line<=2*size+3;line++)
	{
		System.out.print("*");
		if(line==1||line==2*size+3)
		{
		for(int space=1;space<=2*size+1;space++)
		{
		System.out.print(" ");
		}
		System.out.print("*");
		}
		else
		{
		for(int space=line-2;space>0;space--)
		{
		System.out.print(" ");
		}
		System.out.print("*");
		for(int space=2*size-line+2;space>0;space--)
		{
		System.out.print(" ");
		}
		System.out.print("*");
	}
	System.out.print("\n");
}
}
void displayPatternR(int size){
	for(int line=1;line<=size+2;line++)
	{
	if(line==1||line==size+2)
	{
		for(int star=1;star<=2*size+2;star++)
		{
			System.out.print("*");
		}
		System.out.print(" ");
	}
	else
	{
		System.out.print("*");
		for(int space=1;space<=2*size+1;space++)
		{
		System.out.print(" ");
		}
		System.out.print("*");
	}
	System.out.print("\n");
	}
	for(int line=1;line<=size+1;line++)
	{
		System.out.print("*");
		for(int space=line;space>0;space--){
		System.out.print(" ");
		}
		System.out.print("*");
		for(int ospace=line-size;ospace<=size;ospace++)
		{
		System.out.print(" ");
		}
		System.out.print("\n");
	}
}
}
