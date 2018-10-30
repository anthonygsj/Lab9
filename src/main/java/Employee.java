/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /**
     * ahah.
     */
    private String name;
    /**
     * lul
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param n snek.
     * @param m ehhe.
     */
    public Employee(final String n, final String m) {
        this.name = n;
        this.manager = m;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param n d
     */
    public void setName(final String n) {
        this.name = n;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param m d
     */
    public void setManager(final String m) {
        this.manager = m;
    }
}
