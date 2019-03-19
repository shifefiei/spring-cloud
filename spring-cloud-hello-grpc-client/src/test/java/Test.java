public class Test {




    public static void main(String[] args) {

        BaiCaiHong b = new BaiCaiHong();
        b.setName("baicaihong");


    }


    /**
     * 类：class + 名称
     *
     * 特性：
     * 变量，变量的访问域
     * 方法，
     *
     */
   static class BaiCaiHong {

        private String name;
        private int age;
        private String phone;

        /**
         * 构造器
         */
        public BaiCaiHong() {
        }

        public BaiCaiHong(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("eating");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }


}
