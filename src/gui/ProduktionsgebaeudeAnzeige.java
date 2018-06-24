package gui;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.wb.swt.SWTResourceManager;

import enumeration.Produktions_enum;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ProduktionsgebaeudeAnzeige extends Dialog {

	protected Object result;
	protected Shell shlProduktionsgebaeudeAnzeige;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ProduktionsgebaeudeAnzeige(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlProduktionsgebaeudeAnzeige.open();
		shlProduktionsgebaeudeAnzeige.layout();
		Display display = getParent().getDisplay();
		while (!shlProduktionsgebaeudeAnzeige.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlProduktionsgebaeudeAnzeige = new Shell(getParent(), SWT.DIALOG_TRIM | SWT.MIN);
		shlProduktionsgebaeudeAnzeige.setModified(true);
		shlProduktionsgebaeudeAnzeige.setSize(611, 582);
		shlProduktionsgebaeudeAnzeige.setText("Anzeige von Produktionsgeb\u00E4uden");
		
		//Comboboxen definieren und mit enum-Werten füllen
		Combo cbProduktion1 = new Combo(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		
		for (Produktions_enum prod_staette : Produktions_enum.values()) {
			cbProduktion1.add(prod_staette.toString());
		} 
		
		//Beendenbutton definieren und mit Close Fenster schließen
		Button btnBeenden = new Button(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		btnBeenden.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlProduktionsgebaeudeAnzeige.close();
			}
		});
		btnBeenden.setToolTipText("hiermit wird das Fenster geschlossen");
		btnBeenden.setText("Beenden");
		btnBeenden.setBounds(530, 518, 75, 25);
		
		//Combobox-Listener1
		cbProduktion1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Auswahl: " + cbProduktion1.getSelectionIndex());
			}
		});
		cbProduktion1.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		cbProduktion1.setBounds(90, 22, 91, 23);
		
		Label lb1 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb1.setText("Name:");
		lb1.setBounds(10, 74, 55, 15);
		
		Label lb2 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb2.setText("Zeitalter:");
		lb2.setBounds(10, 104, 55, 15);
		
		Label lb3 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb3.setText("M\u00FCnzen:");
		lb3.setBounds(10, 134, 55, 15);
		
		Label lb4 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb4.setText("Werkzeug:");
		lb4.setBounds(10, 164, 55, 15);
		
		Label lb5 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb5.setText("Diamanten:");
		lb5.setBounds(10, 194, 66, 15);
		
		Label lb6 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb6.setText("L\u00E4nge/Breite:");
		lb6.setBounds(10, 224, 79, 15);
		
		Label lb7 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb7.setText("Bauzeit:");
		lb7.setBounds(10, 254, 66, 15);
		
		Label lb8 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb8.setText("Personen:");
		lb8.setBounds(10, 284, 66, 15);
		
		Label lblProduktionszeiten = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lblProduktionszeiten.setAlignment(SWT.CENTER);
		lblProduktionszeiten.setText("Produktionszeiten");
		lblProduktionszeiten.setBounds(10, 317, 228, 15);
		
		Label lb9 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb9.setText("in 5 Minuten:");
		lb9.setBounds(10, 347, 91, 15);
		
		Label lb10 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb10.setText("in 15 Minuten:");
		lb10.setBounds(10, 377, 91, 15);
		
		Label lb11 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb11.setText("in 1 Stunde:");
		lb11.setBounds(10, 407, 91, 15);
		
		Label lb12 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb12.setText("in 4 Stunden:");
		lb12.setBounds(10, 437, 91, 15);
		
		Label lb13 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb13.setText("in 8 Stunden:");
		lb13.setBounds(10, 467, 91, 15);
		
		Label lb14 = new Label(shlProduktionsgebaeudeAnzeige, SWT.NONE);
		lb14.setText("in 1 Tag:");
		lb14.setBounds(10, 497, 91, 15);
		
		text = new Text(shlProduktionsgebaeudeAnzeige, SWT.BORDER);
		text.setEditable(false);
		text.setBounds(90, 74, 91, 21);
		
		text_1 = new Text(shlProduktionsgebaeudeAnzeige, SWT.BORDER);
		text_1.setEditable(false);
		text_1.setBounds(90, 104, 91, 21);
		
		text_2 = new Text(shlProduktionsgebaeudeAnzeige, SWT.BORDER);
		text_2.setEditable(false);
		text_2.setBounds(90, 134, 91, 21);
		
		text_3 = new Text(shlProduktionsgebaeudeAnzeige, SWT.BORDER);
		text_3.setEditable(false);
		text_3.setBounds(90, 164, 91, 21);

	}

}
