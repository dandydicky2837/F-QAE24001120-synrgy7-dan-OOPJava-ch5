public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Constructor
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // Method untuk melakukan deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil. Saldo baru: $" + balance);
        } else {
            System.out.println("Deposit gagal. Jumlah deposit harus lebih besar dari 0.");
        }
    }

    // Method untuk melakukan withdraw
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo baru: $" + balance);
        }
    }

    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount myAccount = new BankAccount("123456", 1000.0, "John Doe", "john@example.com", "1234567890");

        // Menampilkan informasi akun
        System.out.println("Informasi Akun:");
        System.out.println("Nomor Akun: " + myAccount.getAccountNumber());
        System.out.println("Nama Nasabah: " + myAccount.getCustomerName());
        System.out.println("Email Nasabah: " + myAccount.getCustomerEmail());
        System.out.println("Telepon Nasabah: " + myAccount.getCustomerPhone());
        System.out.println("Saldo: $" + myAccount.getBalance());

        // Melakukan deposit dan withdraw
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(1500.0); // akan mencetak pesan error

        // Menampilkan saldo terkini
        System.out.println("Saldo terkini: $" + myAccount.getBalance());
    }
}

