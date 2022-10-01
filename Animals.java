public  interface Animals {
    class cow implements Animals {
        public void Sounds(){
            System.out.println("Cow do MOOOOO MOOOOOO!.");}}
    class cat implements Animals{
        public void Sounds(){
            System.out.println("Cat do MEOWWWWWWW!");}}
    static void main(String[] args){
        cow COW= new cow();
        cat CAT= new cat();
        COW.Sounds();
        CAT.Sounds();}}



