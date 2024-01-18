class Proc {
    public Socket sock
    public DataOutputStream out
    public DataInputStream inp

    Proc(String host, int port, String localIp,int localPort) {
        this.sock = new Socket()
        this.sock.connect(new InetSocketAddress(host, port))
        this.sock.bind(new InetSocketAddress(localIp,localPort))
        this.out = new DataOutputStream(this.sock.getOutputStream())
        this.inp = new DataInputStream(this.sock.getInputStream())
    }

    public static void main(String[] args) {
    def a = new Proc("127.0.0.1",80,"127.0.0.1",199)            
   println(a)
     }
}
