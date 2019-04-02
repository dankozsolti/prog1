import java.io.InputStream;
import java.io.OutputStream;

class ExorTitkosito {
  public ExorTitkosito(String text, InputStream input, OutputStream output) ←-
    {
byte[] key = text.getBytes();
byte[] buffer = new byte[256];
int index = 0;
int readed = 0;
try {
while ((readed = input.read(buffer)) != -1) {
for(int i = 0; i < readed; i++) {
buffer[i] = (byte)(buffer[i] ^ key[index]);
index = (index + 1) % key.length;
}
output.write(buffer, 0, readed);
}
} catch (Exception e) {
System.out.println("Hibas a ciklus *cry* Hiba: " + e.getMessage());
}
}
}
public class Main {
public static void main(String[] args) {
if(args.length > 0)
new ExorTitkosito(args[0], System.in, System.out);
else
System.out.println("Nem adtal meg argumentet!");
}
}
