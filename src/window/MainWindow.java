package window;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Combo;

import blog.Blogg;
import blog.Category;
import blog.Post;
import blog.Author;
import blog.comment;


public class MainWindow {
	private static Text AdisplayText;
	private static Text CinputName;
	private static Text CinputEmail;
	private static Text CinputText;
	private static Text AinputName;
	private static Text AinputAge;
	private static Text AinputEmail;
	private static Text AinputTitle;
	private static Text AinputText;
	private static Text AinputDate;
	private static Text CinputDate;
	private static Text CdisplayText;
	private static Label AdisplayTitle;
	private static Label AdisplayDate;
	private static Label AdisplayName;
	private static Label AdisplayCategory;
	private static Label AdisplayAge;
	private static Label AdisplayEmail;
	private static Label CdisplayDate;
	private static Label CdisplayName;
	private static Label CdisplayEmail;
	private static List list;
	private static Combo AinputCategory;
	
	public static Blogg blogg = new Blogg();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(933, 480);
		shell.setText("SWT Application");
		
		AdisplayTitle = new Label(shell, SWT.NONE);
		AdisplayTitle.setBounds(10, 10, 130, 15);
		AdisplayTitle.setText("Title");
		
		AdisplayText = new Text(shell, SWT.BORDER);
		AdisplayText.setBounds(10, 32, 280, 186);
		AdisplayText.setText("Text");
		
		AdisplayCategory = new Label(shell, SWT.NONE);
		AdisplayCategory.setBounds(146, 224, 144, 15);
		AdisplayCategory.setText("Category");
		
		AdisplayName = new Label(shell, SWT.NONE);
		AdisplayName.setBounds(10, 224, 130, 15);
		AdisplayName.setText("Name");
		
		AdisplayEmail = new Label(shell, SWT.NONE);
		AdisplayEmail.setBounds(10, 266, 130, 15);
		AdisplayEmail.setText("Email");
		
		CinputName = new Text(shell, SWT.BORDER);
		CinputName.setText("Name");
		CinputName.setBounds(363, 7, 280, 21);
		
		CinputEmail = new Text(shell, SWT.BORDER);
		CinputEmail.setText("Email");
		CinputEmail.setBounds(363, 34, 280, 21);
		
		CinputText = new Text(shell, SWT.BORDER);
		CinputText.setText("Text");
		CinputText.setBounds(363, 88, 280, 72);
		
		Button Cadd = new Button(shell, SWT.NONE);
		Cadd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				CdisplayDate.setText("error404");
				CdisplayText.setText("error404");
				CdisplayName.setText("error404");
				CdisplayEmail.setText("error404");
			}
		});
		Cadd.setBounds(363, 166, 81, 25);
		Cadd.setText("Comment");
		
		AinputName = new Text(shell, SWT.BORDER);
		AinputName.setText("Name");
		AinputName.setBounds(363, 221, 274, 21);
		
		AinputAge = new Text(shell, SWT.BORDER);
		AinputAge.setText("Age");
		AinputAge.setBounds(363, 248, 130, 21);
		
		AinputEmail = new Text(shell, SWT.BORDER);
		AinputEmail.setText("Email");
		AinputEmail.setBounds(363, 275, 274, 21);
		
		AinputTitle = new Text(shell, SWT.BORDER);
		AinputTitle.setText("Title");
		AinputTitle.setBounds(363, 302, 130, 21);
		
		AinputText = new Text(shell, SWT.BORDER);
		AinputText.setText("Text");
		AinputText.setBounds(363, 329, 274, 72);
		
		Button Aadd = new Button(shell, SWT.NONE);
		Aadd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Post post = new Post();
				post.text = AinputText.getText();
				post.title = AinputTitle.getText();
				post.date = AinputDate.getText();
				post.author.name = AinputName.getText();
				post.author.age = AinputAge.getText();
				post.author.email = AinputEmail.getText();
				post.category.name = AinputCategory.getText();
				
				AdisplayText.setText(post.text);
				AdisplayTitle.setText(post.title);
				AdisplayDate.setText(post.date);
				AdisplayName.setText(post.author.name);
				AdisplayAge.setText(post.author.age);
				AdisplayEmail.setText(post.author.email);
				AdisplayCategory.setText(post.category.name);
				
				blogg.items.add(post);
				
				list.add(AinputTitle.getText());
				
			}
		});
		Aadd.setBounds(363, 407, 55, 25);
		Aadd.setText("Post");
		
		AdisplayAge = new Label(shell, SWT.NONE);
		AdisplayAge.setBounds(10, 245, 130, 15);
		AdisplayAge.setText("Age");
		
		AdisplayDate = new Label(shell, SWT.NONE);
		AdisplayDate.setBounds(235, 10, 55, 15);
		AdisplayDate.setText("Date");
		
		AinputDate = new Text(shell, SWT.BORDER);
		AinputDate.setText("Date");
		AinputDate.setBounds(507, 248, 130, 21);
		
		CinputDate = new Text(shell, SWT.BORDER);
		CinputDate.setText("Date");
		CinputDate.setBounds(363, 61, 130, 21);
		
		CdisplayText = new Text(shell, SWT.BORDER);
		CdisplayText.setText("Text");
		CdisplayText.setBounds(10, 329, 280, 51);
		
		CdisplayDate = new Label(shell, SWT.NONE);
		CdisplayDate.setBounds(10, 305, 130, 15);
		CdisplayDate.setText("Date");
		
		CdisplayName = new Label(shell, SWT.NONE);
		CdisplayName.setBounds(10, 386, 130, 15);
		CdisplayName.setText("Name");
		
		CdisplayEmail = new Label(shell, SWT.NONE);
		CdisplayEmail.setBounds(10, 407, 130, 15);
		CdisplayEmail.setText("Email");
		
		list = new List(shell, SWT.BORDER);
		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				list.getSelectionIndex();
				int i = list.getSelectionIndex();
				
				AdisplayTitle.setText(blogg.items.get(i).title);
				AdisplayText.setText(blogg.items.get(i).text);
				AdisplayDate.setText(blogg.items.get(i).date);
				AdisplayName.setText(blogg.items.get(i).author.name);
				AdisplayAge.setText(blogg.items.get(i).author.age);
				AdisplayEmail.setText(blogg.items.get(i).author.email);
				AdisplayCategory.setText(blogg.items.get(i).category.name);
			}
		});
		list.setBounds(682, 31, 207, 401);
		
		AinputCategory = new Combo(shell, SWT.NONE);
		AinputCategory.setBounds(507, 302, 130, 23);
		AinputCategory.setText("Category");
		
		Button CategoryAdd = new Button(shell, SWT.NONE);
		CategoryAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Category c = new Category();
				c.name = AinputCategory.getText();
				blogg.categories.add(c);
				AinputCategory.add(c.name);
			}
		});
		CategoryAdd.setBounds(552, 407, 85, 25);
		CategoryAdd.setText("Add Category");
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	public Label getAdisplayTitle() {
		return AdisplayTitle;
	}
	public Label getAdisplayDate() {
		return AdisplayDate;
	}
	public Label getAdisplayName() {
		return AdisplayName;
	}
	public Label getAdisplayCategory() {
		return AdisplayCategory;
	}
	public Label getAdisplayAge() {
		return AdisplayAge;
	}
	public Label getAdisplayEmail() {
		return AdisplayEmail;
	}
	public Label getCdisplayDate() {
		return CdisplayDate;
	}
	public Label getCdisplayName() {
		return CdisplayName;
	}
	public Label getCdisplayEmail() {
		return CdisplayEmail;
	}
	public List getList() {
		return list;
	}
	public Combo getAinputCategory() {
		return AinputCategory;
	}
}
