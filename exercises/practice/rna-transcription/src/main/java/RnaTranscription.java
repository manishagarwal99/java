class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for(int nucleotide=0;nucleotide<dnaStrand.length();nucleotide++){
            switch(dnaStrand.charAt(nucleotide)){
                case 'G':
                    rnaStrand+='C';
                    break;
                case 'C':
                    rnaStrand+='G';
                    break;
                case 'T':
                    rnaStrand+='A';
                    break;
                case 'A':
                    rnaStrand+='U';
                    break;
                default:
                    break;
            }
        }
        return rnaStrand;
    }

}
