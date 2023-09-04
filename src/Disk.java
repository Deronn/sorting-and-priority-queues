// Comparable is implemented in order to be able to compare the capacities of 2 disks
 

public class Disk implements DiskInterface, Comparable<Disk> {

	// disk id
	private int id;

	// List of disk's folders
	private List<Integer> folders = new List<>();

	// disk's size
	private int disk_Size;

	// Constructor
	public Disk(int id) {
		this.id = id;

		disk_Size = 1000000;
	}

	

	@Override
	public List<Integer> get_Files() {
		return folders;
	}

	@Override
	public int getFreeSpace() {
		return disk_Size;

	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void addFileToTheList(int file) {
		folders.insert(file);
		reduce_size(file);
	}

	@Override
	public void reduce_size(int file_size) {
		disk_Size = disk_Size - file_size;
	}

	/**
	 * Compares the size of 2 disks
	 * 
	 * @param B disk to compare with
	 */

	@Override
	public int compareTo(Disk B) {

		if (this.getFreeSpace() == B.getFreeSpace()) {
			return 0;
		}

		else if (this.getFreeSpace() > B.getFreeSpace()) {
			return 1;
		}

		else {
			return -1;
		}
	}
}