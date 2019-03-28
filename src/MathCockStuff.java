public class MathCockStuff
{
    public Cock addCocks(Cock cock1, Cock cock2){

        Cock cockReturn = new Cock();
        cockReturn.length = (cock1.length + cock2.length);
        return cockReturn;
    }
}
