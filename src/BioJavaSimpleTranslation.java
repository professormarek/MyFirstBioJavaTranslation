import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.RNASequence;
import org.biojava.nbio.core.sequence.transcription.Frame;

/**
 * this program illustrates using BioJava classes to do a simple frame translation
 * its correct operation depends on the inclusion of several external JAR files (see slides for details)
 */
public class BioJavaSimpleTranslation {
    public static void main(String[] args) throws CompoundNotFoundException {
        //let's use the DNASequence class to store a DNA Sequnece
        //note that the BioJava DNASequence class can throw an exeception if letter other than CGAT are used!
        DNASequence dna = new DNASequence("CGATTTAGCGGTTCCCC");

        System.out.println("Working with DNA sequence: " + dna);

        //translate the DNA to RNA using the specified frame!
        RNASequence rna = dna.getRNASequence(Frame.REVERSED_TWO);
        System.out.println("translated to RNA: " + rna);

        //get the protein sequence as well
        ProteinSequence protein = rna.getProteinSequence();
        System.out.println("The translated protein sequence is: " + protein);

        System.out.println("Program complete!");

    }
}
