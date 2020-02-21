package basics.string_reverser;

class RecursiveStringReverserTest extends StringReverserTest{

    @Override
    protected StringReverser createInstance() {
        return new RecursiveStringReverser();
    }
}