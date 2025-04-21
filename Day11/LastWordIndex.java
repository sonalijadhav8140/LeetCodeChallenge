LastWordIndex {
    public int lengthOfLastWord(String s) {
        String[] s1=s.split(" ");
        String word=s1[s1.length-1];
      
      System.out.println(word);
      return word.length();
    }
}