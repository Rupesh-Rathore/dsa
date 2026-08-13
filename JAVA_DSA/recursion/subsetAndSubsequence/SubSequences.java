package JAVA_DSA.recursion.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {
    public static void main (String... args ){
        String str = "abc";
        List <String> subSequences = new ArrayList<String>();
        subSequences = subSequencesNotArgumented("",str);
        System.out.println(subSequences);
    }

    static void subSequencesArgumented(String pro, String unpro , List<String> subSequences){
        if (unpro.isEmpty()) {
            subSequences.add(pro);
            return ;
        }

        char chr = unpro.charAt(0);

        subSequencesArgumented(pro , unpro.substring(1), subSequences);
        subSequencesArgumented(pro + chr, unpro.substring(1), subSequences);

        return;
    }

    static List<String> subSequencesNotArgumented(String pro, String unpro){
        if ( unpro.isEmpty() ) {
            List<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        char chr = unpro.charAt(0);

        List<String> notTaking = subSequencesNotArgumented(pro, unpro.substring(1));
        List<String> taking = subSequencesNotArgumented(pro + chr, unpro.substring(1));

        notTaking.addAll(taking);

        return notTaking;
    }
}
