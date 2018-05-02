package ocaJavaSE8.p3.methodsAndEncapsulation;


class A{
    String value = "test";
    A(String val){
        this.value = val;
    }
    public static void main(String[] args) throws Exception {
        new A("new test").defined();	// .undefined(); undefined method resolve to compilation error
    }
	private void defined() {

	}
}
