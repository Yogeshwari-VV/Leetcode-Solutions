class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email: emails){
            int atPos = email.indexOf("@");
            String localName = email.substring(0,atPos);
            String domainName = email.substring(atPos);

            localName = localName.replace(".",""); // localName.replaceAll("\\.","");
            if(localName.contains("+")){
                int plusPos = localName.indexOf("+");
                localName = localName.substring(0,plusPos);
            }
            set.add(localName + domainName);
        }
        return set.size();
        
    }
}