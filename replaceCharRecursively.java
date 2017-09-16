public static String replaceCharacter(String input, char c1, char c2) {
		int n = input.length();
      if(input.length()==0)
          return "";
      if(input.charAt(n-1)==c1)
      { String s=""+c2;
        return replaceCharacter((input.substring(0,n-1)+s),c1,c2);
      }
      else{
        String s1 =""+input.charAt(n-1);
      return replaceCharacter((input.substring(0,n-1)+s1),c1,c2);
    }
	}
