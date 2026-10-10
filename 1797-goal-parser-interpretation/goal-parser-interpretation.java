class Solution {
    public String interpret(String command) {
String c="";
    c=command.replace("()","o");

        c=c.replace("(al)","al");

        return c;
    }
}