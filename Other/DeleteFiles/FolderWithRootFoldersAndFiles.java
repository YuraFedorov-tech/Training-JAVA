package רלטהע;

import java.io.File;

public class readerinput {

	public static void main(String[] args) {
		File file = new File("d:/testFolderWithRootFoldersAndFiles");
		deleteFiles(file);
	}

	private static void deleteFiles(File dir) {
		if (dir.isDirectory()) {
			String[] child = dir.list();
			for (int i = 0; i < child.length; i++) {
				File f = new File(dir, child[i]);
				deleteFiles(f);
			}
			dir.delete();
		}
		dir.delete();

	}

}
