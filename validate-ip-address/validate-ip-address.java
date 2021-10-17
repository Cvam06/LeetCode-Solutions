import java.util.regex.Pattern;

class Solution {
    String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    Pattern pattenIPv4 = Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

    String chunkIPv6 = "([0-9a-fA-F]{1,4})";
    Pattern pattenIPv6 = Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");
    public String validIPAddress(String IP) {
//         regex v4("(([0-9] | [1-9][0-9] | 1[0-9][0-9] | 2[0-4][0-9] | 25[0-5])\\.){3}([0-9] | [1-9][0-9] | 1[0-9][0-9] | 2[0-4][0-9] | 25[0-5])");
        
//         if(regex_match(IP, v4))
//             return "IPv4";
        
//         regex v6("((([0-9a-fA-F]){1,4})\\:){7}(([0-9a-fA-F]){1,4})");
//         if(regex_match(IP, v6))
//             return "IPv6";
        
//         return "Neither";
        
        if (pattenIPv4.matcher(IP).matches()) return "IPv4";
        return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
    }
}