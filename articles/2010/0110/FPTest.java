import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.BitSet;
import com.metamolecular.mx.io.daylight.SMILESReader;
import com.metamolecular.mx.model.Molecule;
import com.metamolecular.mx.fingerprint.PathFingerprinter;

public class FPTest {
  private static PathFingerprinter fingerprinter = new PathFingerprinter();
  
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String str = "";
      while (str != null) {
          System.out.print("> ");
          str = in.readLine();
          processInput(str);
      }
    } catch (IOException e) {
    }
  }
  public static void processInput(String input) {
    if ("exit".equals(input)) {
      System.exit(0);
    }
    Molecule molecule = SMILESReader.read(input);
    BitSet fp = fingerprinter.getFingerprint(molecule);
    System.out.println(fp);
  }
}