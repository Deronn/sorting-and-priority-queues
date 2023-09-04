

public interface DiskInterface {

	
	// @return list of disk's files
	 
	List<Integer> get_Files();

	
	// @return disk's free space

	int getFreeSpace();

	
	// @return disk's id
	
	int getId();

	/**
	 * Inserts a file at the disk
	 * 
	 * @param file that will be inserted
	 */

	void addFileToTheList(int file);

	/**
	 * Reduces the size of the disk if a file is inserted
	 * 
	 * @param file_size size of the file that will be inserted, by which the disk
	 *                  size will be reduced
	 */
	void reduce_size(int file_size);

}