import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: System_ID
 * Date: 2017-11-23
 * Time: 11:04
 */
public class Solution71 {
    public String simplifyPath(String path) {
        String[] element = path.split("/");
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < element.length; i++) {
            if (element[i].equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (element[i].equals("."))
                continue;
            else if (element[i].equals(""))
                continue;
            else {
                stack.push("/" + element[i]);
            }
        }

        if (stack.empty()) {
            stack.push("/");
        }

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < stack.size(); i++) {
            stringBuffer.append(stack.get(i));
        }

        return stringBuffer.toString();
    }
}