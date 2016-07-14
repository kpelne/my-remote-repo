class A1 {
  int i1, i2;
  public void setI1(int i) {i1 = i;}
  public int getI1() {return i1;}
  public void setI2(int i) {i2 = i;}
  public int getI2() {return i2;}
  public A1(int ii1, int ii2) {i1 = ii1; i2 = ii2;}
  public boolean equals(Object obj) {
    if (obj instanceof A1) {
      return (i1 == ((A1)obj).getI1());
    }
    return false;
  }
  public int hashCode() {
    // Insert statement here.
}}

