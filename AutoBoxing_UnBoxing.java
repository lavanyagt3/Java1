package wrapperClass;

public class AutoBoxing_UnBoxing {

	public static void main(String[] args) {
		
		byte primitivebyte=1;
		Byte wrrapperbyte =primitivebyte;
		System.out.println("Autoboxing " +wrrapperbyte);

	
		byte unboxedbyte =wrrapperbyte;
		System.out.println("Unboxed " +unboxedbyte);
		
		short primitiveshort=2;
		Short wrappershort=primitiveshort;
		System.out.println("Autoboxing " +wrappershort);
		
		
		short unboxedshort=wrappershort;
		System.out.println("Unboxed " +unboxedshort);
		
		 int primitiveInt = 3;
	     Integer wrapperInt = primitiveInt; 
	     System.out.println("Autoboxed Integer: " + wrapperInt);
	        

	     int unboxedInt = wrapperInt; 
	     System.out.println("Unboxed int: " + unboxedInt);
		
		long primitiveLong = 4L;
        Long wrapperLong = primitiveLong; 
        System.out.println("Autoboxed Long: " + wrapperLong);

        long unboxedLong = wrapperLong; 
        System.out.println("Unboxed long: " + unboxedLong);

        float primitiveFloat = 5.5f;
        Float wrapperFloat = primitiveFloat; 
        System.out.println("Autoboxed Float: " + wrapperFloat);
        

        float unboxedFloat = wrapperFloat; 
        System.out.println("Unboxed float: " + unboxedFloat);

        double primitiveDouble = 6.6d;
        Double wrapperDouble = primitiveDouble; 
        System.out.println("Autoboxed Double: " + wrapperDouble);
        

        double unboxedDouble = wrapperDouble; 
        System.out.println("Unboxed double: " + unboxedDouble);


        char primitiveChar = 'a';
        Character wrapperChar = primitiveChar; 
        System.out.println("Autoboxed Character: " + wrapperChar);
        
        char unboxedChar = wrapperChar; 
        System.out.println("Unboxed char: " + unboxedChar);

        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; 
        System.out.println("Autoboxed Boolean: " + wrapperBoolean);

        boolean unboxedBoolean = wrapperBoolean; 
        System.out.println("Unboxed boolean: " + unboxedBoolean);


		
	}

}