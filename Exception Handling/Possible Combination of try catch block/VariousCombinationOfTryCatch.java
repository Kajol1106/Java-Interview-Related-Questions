package com.ExceptionHandling;



public class VariousCombinationOfTryCatch {

	public static void main(String[] args) {
		/*
		//1. try can't work without catch block
		try {
			// code
		}
		*/
		
		/*
		 // 2. catch can't work without try block
		  catch {
			// code
		  }
		 */
		
		//3. try and catch work in pairs
		try {
			//code
		} 
		catch (Exception e) {
			// code
		}
		
		//4. we can use many as catch blocks with same try block
		try 
		{
			//code
		} 
		catch (Exception e) {
			// code
		}	
		catch (Exception e) {
			// code
		}
		
		
		//5. We can write try-catch block inside the catch block
		try 
		{
			//code
		} 
		catch (Exception e) 
		{
			try 
			{
				//code
			} 
			catch (Exception e2) 
			{
				//code
			}
		}
		
		
		//6. try block can contain another try-catch block inside it.
		try 
		{
			try 
			{
				//code
			} 
			catch (Exception e) 
			{
				//code
			}
		} 
		catch (Exception e) 
		{
			//code
		}
		
		
		//7. we can use try-catch inside the finally block also.
		finally 
		{
			try 
			{
				//code
			} 
			catch (Exception e2) 
			{
				//code
			}
		}
	}

}
