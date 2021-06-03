package ro.ase.cts.seminar14.clase;

import java.util.ArrayList;
import java.util.List;

public class Grupa {
  //O grupa contine maxim 35 de studenti
// Numarul grupei pentru facultatea noastra este cuprins intre 1000 - 1100
        private List<IStudent> studenti;
        private int nrGrupa;

        public Grupa(int nrGrupa){
            if(nrGrupa < 1000 || nrGrupa > 1100) {
                throw new IllegalArgumentException();
            }

            this.nrGrupa=nrGrupa;
            this.studenti=new ArrayList<>();
        }

        public List<IStudent> getStudenti() {
            return studenti;
        }

        public int getNrGrupa() {
            return nrGrupa;
        }

        public void importaStudenti(List<IStudent> studenti){
            this.studenti.addAll(studenti);
        }

        public void adaugaStudent(IStudent student){
            studenti.add(student);
        }

        public IStudent getStudent(int index){
            if(index>=0 && index< studenti.size()){
                return studenti.get(index);
            }
            throw new IndexOutOfBoundsException();
        }

        public float getPromovabilitate(){
            int nrRestantieri=0;
            for(IStudent student:studenti){
                if(student.areRestante()){
                    nrRestantieri++;
                }
            }
            return (float)(studenti.size()-nrRestantieri/studenti.size());
        }
}
