
class ReversePolishNotation {

    private StackNode top;
    private final String command;
    
    
    public void into(double new_data) {
StackNode new_node = new StackNode(new_data, top);
top = new_node;
}

public double TopData( ) {
double top_data = top.data;
top = top.underneath;
return top_data;
}

public ReversePolishNotation(String command) {
top = null;
this.command = command;
}

public double get( ) {
double a, b;
int j;

for(int i = 0; i < command.length( ); i++) {
// if it's a digit
if(Character.isDigit(command.charAt(i))) {
double number;

// get a string of the number
String temp = "";
for(j = 0; (j < 100) && (Character.isDigit(command.charAt(i)) || (command.charAt(i) == '.')); j++, i++) {
temp = temp + String.valueOf(command.charAt(i));
}

// convert to double and add to the stack
number = Double.parseDouble(temp);
into(number);
} 
else if(command.charAt(i) == '+') {
b = TopData( );
a = TopData( );
into(a + b);
} 
else if(command.charAt(i) == '-') {
b = TopData( );
a = TopData( );
into(a - b);
} else if(command.charAt(i) == '*') {
b = TopData( );
a = TopData( );
into(a * b);
} 
else if(command.charAt(i) == '/') {
b = TopData( );
a = TopData( );
into(a / b);
}
else if(command.charAt(i) == '^') {
b = TopData( );
a = TopData( );
into(Math.pow(a, b));

} else if(command.charAt(i) != ' ') {
throw new IllegalArgumentException( );
  }
}

double val = TopData( );

if(top != null) {
throw new IllegalArgumentException( );
}

return val;

   } 
}