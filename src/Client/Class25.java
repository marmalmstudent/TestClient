package Client;

import Client.sign.signlink;
import java.io.PrintStream;

public class Class25 {

	public Class25(int nbrYTiles, byte byte0, int nbrXTiles, int ai[][][], int nbrStoreys) {
		aBoolean429 = true;
		aBoolean434 = true;
		aBoolean435 = false;
		aClass28Array444 = new Class28[5000];
		anIntArray486 = new int[10000];
		anIntArray487 = new int[10000];
		highestStorey = nbrStoreys;
		totNbrXTiles = nbrXTiles;
		totNbrYTiles = nbrYTiles;
		if (byte0 != 43) {
			throw new NullPointerException();
		} else {
			tilesForAllStoreys = new Class30_Sub3[nbrStoreys][nbrXTiles][nbrYTiles];
			anIntArrayArrayArray445 = new int[nbrStoreys][nbrXTiles + 1][nbrYTiles + 1];
			tileCornerHeight = ai;
			method274(619);
			return;
		}
	}

	public static void method273(int i) {
		aClass28Array462 = null;
		while (i >= 0)
			anInt432 = -333;
		anIntArray473 = null;
		aClass47ArrayArray474 = null;
		aClass19_477 = null;
		tileVisible = null;
		tilesVisibleForThisAngle = null;
	}

	public void method274(int i) {
		for (int storey = 0; storey < highestStorey; storey++) {
			for (int xTile = 0; xTile < totNbrXTiles; xTile++) {
				for (int yTile = 0; yTile < totNbrYTiles; yTile++)
					tilesForAllStoreys[storey][xTile][yTile] = null;

			}

		}

		i = 37 / i;
		for (int l = 0; l < anInt472; l++) {
			for (int j1 = 0; j1 < anIntArray473[l]; j1++)
				aClass47ArrayArray474[l][j1] = null;

			anIntArray473[l] = 0;
		}

		for (int k1 = 0; k1 < anInt443; k1++)
			aClass28Array444[k1] = null;

		anInt443 = 0;
		for (int l1 = 0; l1 < aClass28Array462.length; l1++)
			aClass28Array462[l1] = null;

	}

	public void method275(int storey, int j) {
		if (j != -34686)
			return;
		lowestStorey = storey;
		for (int xTile = 0; xTile < totNbrXTiles; xTile++) {
			for (int yTile = 0; yTile < totNbrYTiles; yTile++) {
				if (tilesForAllStoreys[storey][xTile][yTile] == null) {
					tilesForAllStoreys[storey][xTile][yTile] = new Class30_Sub3(storey, xTile, yTile);
				}
			}

		}

	}

	/**
	 * Looks like player moves up one storey.
	 * 
	 * @param yTile
	 * @param xTile
	 * @param k
	 */
	public void method276(int yTile, int xTile, int k) {
		Class30_Sub3 tilesForLowestStorey = tilesForAllStoreys[0][xTile][yTile];
		for (int storey = 0; storey < 3; storey++) {
			Class30_Sub3 tilesForThisStorey = tilesForAllStoreys[storey][xTile][yTile] = tilesForAllStoreys[storey
					+ 1][xTile][yTile];
			if (tilesForThisStorey != null) {
				tilesForThisStorey.anInt1307--;
				for (int j1 = 0; j1 < tilesForThisStorey.anInt1317; j1++) {
					Class28 class28 = tilesForThisStorey.aClass28Array1318[j1];
					if ((class28.anInt529 >> 29 & 3) == 2 && class28.anInt523 == xTile && class28.anInt525 == yTile)
						class28.anInt517--;
				}

			}
		}

		while (k >= 0) {
			for (int i1 = 1; i1 > 0; i1++)
				;
		}
		if (tilesForAllStoreys[0][xTile][yTile] == null)
			tilesForAllStoreys[0][xTile][yTile] = new Class30_Sub3(0, xTile, yTile);
		tilesForAllStoreys[0][xTile][yTile].aClass30_Sub3_1329 = tilesForLowestStorey;
		tilesForAllStoreys[3][xTile][yTile] = null;
	}

	public static void method277(int i, int j, int k, int l, int i1, int j1, int k1, int l1, int i2) {
		while (k1 >= 0)
			anInt432 = -170;
		Class47 class47 = new Class47();
		class47.anInt787 = j / 128;
		class47.anInt788 = l / 128;
		class47.anInt789 = l1 / 128;
		class47.anInt790 = i1 / 128;
		class47.anInt791 = i2;
		class47.anInt792 = j;
		class47.anInt793 = l;
		class47.anInt794 = l1;
		class47.anInt795 = i1;
		class47.anInt796 = j1;
		class47.anInt797 = k;
		aClass47ArrayArray474[i][anIntArray473[i]++] = class47;
	}

	public void method278(int i, int j, int k, int l) {
		Class30_Sub3 class30_sub3 = tilesForAllStoreys[i][j][k];
		if (class30_sub3 == null) {
			return;
		} else {
			tilesForAllStoreys[i][j][k].anInt1321 = l;
			return;
		}
	}

	public void method279(int storey, int xTile, int yTile, int l, int i1, int j1, int k1, int l1, int i2, int j2,
			int k2, int l2, int i3, int j3, int k3, int l3, int i4, int j4, int k4, int l4) {
		if (l == 0) {
			Class43 class43 = new Class43(k2, l2, i3, j3, -1, k4, false);
			for (int storeyIdx = storey; storeyIdx >= 0; storeyIdx--)
				if (tilesForAllStoreys[storeyIdx][xTile][yTile] == null)
					tilesForAllStoreys[storeyIdx][xTile][yTile] = new Class30_Sub3(storeyIdx, xTile, yTile);

			tilesForAllStoreys[storey][xTile][yTile].aClass43_1311 = class43;
			return;
		}
		if (l == 1) {
			Class43 class43_1 = new Class43(k3, l3, i4, j4, j1, l4, k1 == l1 && k1 == i2 && k1 == j2);
			for (int storeyIdx = storey; storeyIdx >= 0; storeyIdx--)
				if (tilesForAllStoreys[storeyIdx][xTile][yTile] == null)
					tilesForAllStoreys[storeyIdx][xTile][yTile] = new Class30_Sub3(storeyIdx, xTile, yTile);

			tilesForAllStoreys[storey][xTile][yTile].aClass43_1311 = class43_1;
			return;
		}
		Class40 class40 = new Class40(yTile, k3, j3, i2, j1, i4, i1, k2, k4, i3, j2, l1, k1, l, j4, l3, l2, 3, xTile,
				l4);
		for (int storeyIdx = storey; storeyIdx >= 0; storeyIdx--)
			if (tilesForAllStoreys[storeyIdx][xTile][yTile] == null)
				tilesForAllStoreys[storeyIdx][xTile][yTile] = new Class30_Sub3(storeyIdx, xTile, yTile);

		tilesForAllStoreys[storey][xTile][yTile].aClass40_1312 = class40;
	}

	public void method280(int storey, int j, int yTile, int l, Class30_Sub2_Sub4 class30_sub2_sub4, byte byte0, int i1,
			int xTile) {
		if (class30_sub2_sub4 == null)
			return;
		Class49 class49 = new Class49();
		class49.aClass30_Sub2_Sub4_814 = class30_sub2_sub4;
		class49.anInt812 = xTile * 128 + 64;
		class49.anInt813 = yTile * 128 + 64;
		if (l <= 0)
			aBoolean435 = !aBoolean435;
		class49.anInt811 = j;
		class49.anInt815 = i1;
		class49.aByte816 = byte0;
		if (tilesForAllStoreys[storey][xTile][yTile] == null)
			tilesForAllStoreys[storey][xTile][yTile] = new Class30_Sub3(storey, xTile, yTile);
		tilesForAllStoreys[storey][xTile][yTile].aClass49_1315 = class49;
	}

	public void method281(byte byte0, int xTile, int j, Class30_Sub2_Sub4 class30_sub2_sub4, int k,
			Class30_Sub2_Sub4 class30_sub2_sub4_1, Class30_Sub2_Sub4 class30_sub2_sub4_2, int storey, int yTile) {
		Class3 class3 = new Class3();
		class3.aClass30_Sub2_Sub4_48 = class30_sub2_sub4_2;
		class3.anInt46 = xTile * 128 + 64;
		class3.anInt47 = yTile * 128 + 64;
		if (byte0 != 7)
			return;
		class3.anInt45 = k;
		class3.anInt51 = j;
		class3.aClass30_Sub2_Sub4_49 = class30_sub2_sub4;
		class3.aClass30_Sub2_Sub4_50 = class30_sub2_sub4_1;
		int j1 = 0;
		Class30_Sub3 class30_sub3 = tilesForAllStoreys[storey][xTile][yTile];
		if (class30_sub3 != null) {
			for (int k1 = 0; k1 < class30_sub3.anInt1317; k1++)
				if (class30_sub3.aClass28Array1318[k1].aClass30_Sub2_Sub4_521 instanceof Class30_Sub2_Sub4_Sub6) {
					int l1 = ((Class30_Sub2_Sub4_Sub6) class30_sub3.aClass28Array1318[k1].aClass30_Sub2_Sub4_521).anInt1654;
					if (l1 > j1)
						j1 = l1;
				}

		}
		class3.anInt52 = j1;
		if (tilesForAllStoreys[storey][xTile][yTile] == null)
			tilesForAllStoreys[storey][xTile][yTile] = new Class30_Sub3(storey, xTile, yTile);
		tilesForAllStoreys[storey][xTile][yTile].aClass3_1316 = class3;
	}

	public void method282(int i, Class30_Sub2_Sub4 class30_sub2_sub4, boolean flag, int j, int yTile, byte byte0,
			int xTile, Class30_Sub2_Sub4 class30_sub2_sub4_1, int i1, int j1, int storey) {
		if (!flag)
			aBoolean434 = !aBoolean434;
		if (class30_sub2_sub4 == null && class30_sub2_sub4_1 == null)
			return;
		Class10 class10 = new Class10();
		class10.anInt280 = j;
		class10.aByte281 = byte0;
		class10.anInt274 = xTile * 128 + 64;
		class10.anInt275 = yTile * 128 + 64;
		class10.anInt273 = i1;
		class10.aClass30_Sub2_Sub4_278 = class30_sub2_sub4;
		class10.aClass30_Sub2_Sub4_279 = class30_sub2_sub4_1;
		class10.anInt276 = i;
		class10.anInt277 = j1;
		for (int storeyIdx = storey; storeyIdx >= 0; storeyIdx--)
			if (tilesForAllStoreys[storeyIdx][xTile][yTile] == null)
				tilesForAllStoreys[storeyIdx][xTile][yTile] = new Class30_Sub3(storeyIdx, xTile, yTile);

		tilesForAllStoreys[storey][xTile][yTile].aClass10_1313 = class10;
	}

	public void method283(int i, int yTile, int k, int l, int storey, int j1, int k1,
			Class30_Sub2_Sub4 class30_sub2_sub4, int xTile, byte byte0, int i2, int j2) {
		if (class30_sub2_sub4 == null)
			return;
		Class26 class26 = new Class26();
		class26.anInt505 = i;
		while (l >= 0)
			aBoolean435 = !aBoolean435;
		class26.aByte506 = byte0;
		class26.anInt500 = xTile * 128 + 64 + j1;
		class26.anInt501 = yTile * 128 + 64 + i2;
		class26.anInt499 = k1;
		class26.aClass30_Sub2_Sub4_504 = class30_sub2_sub4;
		class26.anInt502 = j2;
		class26.anInt503 = k;
		for (int storeyIdx = storey; storeyIdx >= 0; storeyIdx--)
			if (tilesForAllStoreys[storeyIdx][xTile][yTile] == null)
				tilesForAllStoreys[storeyIdx][xTile][yTile] = new Class30_Sub3(storeyIdx, xTile, yTile);

		tilesForAllStoreys[storey][xTile][yTile].aClass26_1314 = class26;
	}

	public boolean method284(int i, byte byte0, int j, int k, Class30_Sub2_Sub4 class30_sub2_sub4, int l, int i1,
			int j1, byte byte1, int k1, int l1) {
		if (byte1 != 110)
			anInt431 = 250;
		if (class30_sub2_sub4 == null) {
			return true;
		} else {
			int i2 = l1 * 128 + 64 * l;
			int j2 = k1 * 128 + 64 * k;
			return method287(i1, l1, k1, l, k, i2, j2, j, class30_sub2_sub4, j1, false, i, byte0);
		}
	}

	public boolean method285(int i, int j, byte byte0, int k, int l, int i1, int j1, int k1,
			Class30_Sub2_Sub4 class30_sub2_sub4, boolean flag) {
		if (class30_sub2_sub4 == null)
			return true;
		int l1 = k1 - j1;
		int i2 = i1 - j1;
		int j2 = k1 + j1;
		int k2 = i1 + j1;
		if (flag) {
			if (j > 640 && j < 1408)
				k2 += 128;
			if (j > 1152 && j < 1920)
				j2 += 128;
			if (j > 1664 || j < 384)
				i2 -= 128;
			if (j > 128 && j < 896)
				l1 -= 128;
		}
		l1 /= 128;
		if (byte0 == 6)
			byte0 = 0;
		else
			throw new NullPointerException();
		i2 /= 128;
		j2 /= 128;
		k2 /= 128;
		return method287(i, l1, i2, (j2 - l1) + 1, (k2 - i2) + 1, k1, i1, k, class30_sub2_sub4, j, true, l, (byte) 0);
	}

	public boolean method286(int i, int j, int k, Class30_Sub2_Sub4 class30_sub2_sub4, int l, int i1, int j1, int k1,
			int l1, int i2, int j2, int k2, byte byte0) {
		if (byte0 != 35) {
			for (int l2 = 1; l2 > 0; l2++)
				;
		}
		if (class30_sub2_sub4 == null)
			return true;
		else
			return method287(j, l1, k2, (i2 - l1) + 1, (i1 - k2) + 1, j1, k, k1, class30_sub2_sub4, l, true, j2,
					(byte) 0);
	}

	private boolean method287(int storey, int xTileStart, int yTileStart, int nbrXTiles, int nbrYTiles, int j1, int k1,
			int l1, Class30_Sub2_Sub4 class30_sub2_sub4, int i2, boolean flag, int j2, byte byte0) {
		for (int xTile = xTileStart; xTile < xTileStart + nbrXTiles; xTile++) {
			for (int yTile = yTileStart; yTile < yTileStart + nbrYTiles; yTile++) {
				if (xTile < 0 || yTile < 0 || xTile >= totNbrXTiles || yTile >= totNbrYTiles)
					return false;
				Class30_Sub3 class30_sub3 = tilesForAllStoreys[storey][xTile][yTile];
				if (class30_sub3 != null && class30_sub3.anInt1317 >= 5)
					return false;
			}

		}

		Class28 class28 = new Class28();
		class28.anInt529 = j2;
		class28.aByte530 = byte0;
		class28.anInt517 = storey;
		class28.anInt519 = j1;
		class28.anInt520 = k1;
		class28.anInt518 = l1;
		class28.aClass30_Sub2_Sub4_521 = class30_sub2_sub4;
		class28.anInt522 = i2;
		class28.anInt523 = xTileStart;
		class28.anInt525 = yTileStart;
		class28.anInt524 = (xTileStart + nbrXTiles) - 1;
		class28.anInt526 = (yTileStart + nbrYTiles) - 1;
		for (int xTile = xTileStart; xTile < xTileStart + nbrXTiles; xTile++) {
			for (int yTile = yTileStart; yTile < yTileStart + nbrYTiles; yTile++) {
				int k3 = 0;
				if (xTile > xTileStart)
					k3++;
				if (xTile < (xTileStart + nbrXTiles) - 1)
					k3 += 4;
				if (yTile > yTileStart)
					k3 += 8;
				if (yTile < (yTileStart + nbrYTiles) - 1)
					k3 += 2;
				for (int storeyIdx = storey; storeyIdx >= 0; storeyIdx--)
					if (tilesForAllStoreys[storeyIdx][xTile][yTile] == null)
						tilesForAllStoreys[storeyIdx][xTile][yTile] = new Class30_Sub3(storeyIdx, xTile, yTile);

				Class30_Sub3 class30_sub3_1 = tilesForAllStoreys[storey][xTile][yTile];
				class30_sub3_1.aClass28Array1318[class30_sub3_1.anInt1317] = class28;
				class30_sub3_1.anIntArray1319[class30_sub3_1.anInt1317] = k3;
				class30_sub3_1.anInt1320 |= k3;
				class30_sub3_1.anInt1317++;
			}

		}

		if (flag)
			aClass28Array444[anInt443++] = class28;
		return true;
	}

	public void method288(byte byte0) {
		if (byte0 != 104)
			aBoolean435 = !aBoolean435;
		for (int i = 0; i < anInt443; i++) {
			Class28 class28 = aClass28Array444[i];
			method289(-997, class28);
			aClass28Array444[i] = null;
		}

		anInt443 = 0;
	}

	private void method289(int i, Class28 class28) {
		if (i >= 0)
			return;
		for (int j = class28.anInt523; j <= class28.anInt524; j++) {
			for (int k = class28.anInt525; k <= class28.anInt526; k++) {
				Class30_Sub3 class30_sub3 = tilesForAllStoreys[class28.anInt517][j][k];
				if (class30_sub3 != null) {
					for (int l = 0; l < class30_sub3.anInt1317; l++) {
						if (class30_sub3.aClass28Array1318[l] != class28)
							continue;
						class30_sub3.anInt1317--;
						for (int i1 = l; i1 < class30_sub3.anInt1317; i1++) {
							class30_sub3.aClass28Array1318[i1] = class30_sub3.aClass28Array1318[i1 + 1];
							class30_sub3.anIntArray1319[i1] = class30_sub3.anIntArray1319[i1 + 1];
						}

						class30_sub3.aClass28Array1318[class30_sub3.anInt1317] = null;
						break;
					}

					class30_sub3.anInt1320 = 0;
					for (int j1 = 0; j1 < class30_sub3.anInt1317; j1++)
						class30_sub3.anInt1320 |= class30_sub3.anIntArray1319[j1];

				}
			}

		}

	}

	public void method290(int yTile, int j, int k, int xTile, int storey) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (j <= 0)
			aBoolean429 = !aBoolean429;
		if (tile == null)
			return;
		Class26 class26 = tile.aClass26_1314;
		if (class26 == null) {
			return;
		} else {
			int j1 = xTile * 128 + 64;
			int k1 = yTile * 128 + 64;
			class26.anInt500 = j1 + ((class26.anInt500 - j1) * k) / 16;
			class26.anInt501 = k1 + ((class26.anInt501 - k1) * k) / 16;
			return;
		}
	}

	public void method291(int xTile, int storey, int yTile, byte byte0) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (byte0 != -119)
			aBoolean434 = !aBoolean434;
		if (tile == null) {
			return;
		} else {
			tile.aClass10_1313 = null;
			return;
		}
	}

	public void method292(int i, int yTile, int storey, int xTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null) {
			return;
		} else {
			tile.aClass26_1314 = null;
			if (i == 0)
				;
			return;
		}
	}

	public void method293(int storey, int j, int xTile, int yTile) {
		if (j >= 0) {
			for (int i1 = 1; i1 > 0; i1++)
				;
		}
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return;
		for (int j1 = 0; j1 < tile.anInt1317; j1++) {
			Class28 class28 = tile.aClass28Array1318[j1];
			if ((class28.anInt529 >> 29 & 3) == 2 && class28.anInt523 == xTile && class28.anInt525 == yTile) {
				method289(-997, class28);
				return;
			}
		}

	}

	public void method294(byte byte0, int storey, int yTile, int xTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return;
		tile.aClass49_1315 = null;
		if (byte0 == 9)
			byte0 = 0;
	}

	public void method295(int storey, int xTile, int yTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null) {
			return;
		} else {
			tile.aClass3_1316 = null;
			return;
		}
	}

	public Class10 method296(int storey, int xTile, int yTile, boolean flag) {
		if (flag)
			anInt433 = -195;
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return null;
		else
			return tile.aClass10_1313;
	}

	public Class26 method297(int xTile, int j, int yTile, int storey) {
		if (j <= 0)
			throw new NullPointerException();
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return null;
		else
			return tile.aClass26_1314;
	}

	public Class28 method298(int xTile, int yTile, byte byte0, int storey) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return null;
		for (int l = 0; l < tile.anInt1317; l++) {
			Class28 class28 = tile.aClass28Array1318[l];
			if ((class28.anInt529 >> 29 & 3) == 2 && class28.anInt523 == xTile && class28.anInt525 == yTile)
				return class28;
		}

		if (byte0 == 4)
			byte0 = 0;
		else
			anInt432 = -376;
		return null;
	}

	public Class49 method299(int yTile, int xTile, int storey, int l) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (l != 0) {
			for (int i1 = 1; i1 > 0; i1++)
				;
		}
		if (tile == null || tile.aClass49_1315 == null)
			return null;
		else
			return tile.aClass49_1315;
	}

	public int method300(int storey, int xTile, int yTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null || tile.aClass10_1313 == null)
			return 0;
		else
			return tile.aClass10_1313.anInt280;
	}

	public int method301(int storey, int xTile, int k, int yTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (k != 0)
			return anInt430;
		if (tile == null || tile.aClass26_1314 == null)
			return 0;
		else
			return tile.aClass26_1314.anInt505;
	}

	public int method302(int storey, int xTile, int yTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return 0;
		for (int l = 0; l < tile.anInt1317; l++) {
			Class28 class28 = tile.aClass28Array1318[l];
			if ((class28.anInt529 >> 29 & 3) == 2 && class28.anInt523 == xTile && class28.anInt525 == yTile)
				return class28.anInt529;
		}

		return 0;
	}

	public int method303(int storey, int xTile, int yTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null || tile.aClass49_1315 == null)
			return 0;
		else
			return tile.aClass49_1315.anInt815;
	}

	public int method304(int storey, int xTile, int yTile, int l) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return -1;
		if (tile.aClass10_1313 != null && tile.aClass10_1313.anInt280 == l)
			return tile.aClass10_1313.aByte281 & 0xff;
		if (tile.aClass26_1314 != null && tile.aClass26_1314.anInt505 == l)
			return tile.aClass26_1314.aByte506 & 0xff;
		if (tile.aClass49_1315 != null && tile.aClass49_1315.anInt815 == l)
			return tile.aClass49_1315.aByte816 & 0xff;
		for (int i1 = 0; i1 < tile.anInt1317; i1++)
			if (tile.aClass28Array1318[i1].anInt529 == l)
				return tile.aClass28Array1318[i1].aByte530 & 0xff;

		return -1;
	}

	public void method305(int i, byte byte0, int j, int k, int l, int i1) {
		int radius = (int) Math.sqrt(k * k + i * i + i1 * i1);
		int k1 = l * radius >> 8;
		if (byte0 != 3)
			aBoolean434 = !aBoolean434;
		for (int storey = 0; storey < highestStorey; storey++) {
			for (int xTile = 0; xTile < totNbrXTiles; xTile++) {
				for (int yTile = 0; yTile < totNbrYTiles; yTile++) {
					Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
					if (tile != null) {
						Class10 class10 = tile.aClass10_1313;
						if (class10 != null && class10.aClass30_Sub2_Sub4_278 != null
								&& class10.aClass30_Sub2_Sub4_278.aClass33Array1425 != null) {
							method307(storey, 1, 1, xTile, (byte) 115, yTile,
									(Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_278);
							if (class10.aClass30_Sub2_Sub4_279 != null
									&& class10.aClass30_Sub2_Sub4_279.aClass33Array1425 != null) {
								method307(storey, 1, 1, xTile, (byte) 115, yTile,
										(Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_279);
								method308((Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_278,
										(Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_279, 0, 0, 0, false);
								((Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_279).method480(j, k1, k, i, i1);
							}
							((Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_278).method480(j, k1, k, i, i1);
						}
						for (int k2 = 0; k2 < tile.anInt1317; k2++) {
							Class28 class28 = tile.aClass28Array1318[k2];
							if (class28 != null && class28.aClass30_Sub2_Sub4_521 != null
									&& class28.aClass30_Sub2_Sub4_521.aClass33Array1425 != null) {
								method307(storey, (class28.anInt524 - class28.anInt523) + 1,
										(class28.anInt526 - class28.anInt525) + 1, xTile, (byte) 115, yTile,
										(Class30_Sub2_Sub4_Sub6) class28.aClass30_Sub2_Sub4_521);
								((Class30_Sub2_Sub4_Sub6) class28.aClass30_Sub2_Sub4_521).method480(j, k1, k, i, i1);
							}
						}

						Class49 class49 = tile.aClass49_1315;
						if (class49 != null && class49.aClass30_Sub2_Sub4_814.aClass33Array1425 != null) {
							method306(xTile, storey, (Class30_Sub2_Sub4_Sub6) class49.aClass30_Sub2_Sub4_814, (byte) 37, yTile);
							((Class30_Sub2_Sub4_Sub6) class49.aClass30_Sub2_Sub4_814).method480(j, k1, k, i, i1);
						}
					}
				}

			}

		}

	}

	private void method306(int xTile, int storey, Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6, byte byte0, int yTile) {
		if (byte0 != 37) {
			for (int l = 1; l > 0; l++)
				;
		}
		if (xTile < totNbrXTiles) {
			Class30_Sub3 class30_sub3 = tilesForAllStoreys[storey][xTile + 1][yTile];
			if (class30_sub3 != null && class30_sub3.aClass49_1315 != null
					&& class30_sub3.aClass49_1315.aClass30_Sub2_Sub4_814.aClass33Array1425 != null)
				method308(class30_sub2_sub4_sub6,
						(Class30_Sub2_Sub4_Sub6) class30_sub3.aClass49_1315.aClass30_Sub2_Sub4_814, 128, 0, 0, true);
		}
		if (yTile < totNbrXTiles) {
			Class30_Sub3 class30_sub3_1 = tilesForAllStoreys[storey][xTile][yTile + 1];
			if (class30_sub3_1 != null && class30_sub3_1.aClass49_1315 != null
					&& class30_sub3_1.aClass49_1315.aClass30_Sub2_Sub4_814.aClass33Array1425 != null)
				method308(class30_sub2_sub4_sub6,
						(Class30_Sub2_Sub4_Sub6) class30_sub3_1.aClass49_1315.aClass30_Sub2_Sub4_814, 0, 0, 128, true);
		}
		if (xTile < totNbrXTiles && yTile < totNbrYTiles) {
			Class30_Sub3 class30_sub3_2 = tilesForAllStoreys[storey][xTile + 1][yTile + 1];
			if (class30_sub3_2 != null && class30_sub3_2.aClass49_1315 != null
					&& class30_sub3_2.aClass49_1315.aClass30_Sub2_Sub4_814.aClass33Array1425 != null)
				method308(class30_sub2_sub4_sub6,
						(Class30_Sub2_Sub4_Sub6) class30_sub3_2.aClass49_1315.aClass30_Sub2_Sub4_814, 128, 0, 128,
						true);
		}
		if (xTile < totNbrXTiles && yTile > 0) {
			Class30_Sub3 class30_sub3_3 = tilesForAllStoreys[storey][xTile + 1][yTile - 1];
			if (class30_sub3_3 != null && class30_sub3_3.aClass49_1315 != null
					&& class30_sub3_3.aClass49_1315.aClass30_Sub2_Sub4_814.aClass33Array1425 != null)
				method308(class30_sub2_sub4_sub6,
						(Class30_Sub2_Sub4_Sub6) class30_sub3_3.aClass49_1315.aClass30_Sub2_Sub4_814, 128, 0, -128,
						true);
		}
	}

	private void method307(int storey, int nbrXTiles, int nbrYTiles, int xTileProvided, byte byte0, int yTileProvided,
			Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6) {
		boolean flag = true;
		if (byte0 != 115)
			anInt431 = 350;
		int xTileStart = xTileProvided;
		int xTileEnd = xTileProvided + nbrXTiles;
		int yTileStart = yTileProvided - 1;
		int yTileEnd = yTileProvided + nbrYTiles;
		for (int storeyIxd = storey; storeyIxd <= storey + 1; storeyIxd++)
		{
			if (storeyIxd != highestStorey)
			{
				for (int xTile = xTileStart; xTile <= xTileEnd; xTile++)
				{
					if (xTile >= 0 && xTile < totNbrXTiles)
					{
						for (int yTile = yTileStart; yTile <= yTileEnd; yTile++)
						{
							if (yTile >= 0 && yTile < totNbrYTiles && (!flag || xTile >= xTileEnd || yTile >= yTileEnd || yTile < yTileProvided && xTile != xTileProvided))
							{
								Class30_Sub3 tile = tilesForAllStoreys[storeyIxd][xTile][yTile];
								if (tile != null)
								{
									int i3 = (tileCornerHeight[storeyIxd][xTile][yTile]
											+ tileCornerHeight[storeyIxd][xTile + 1][yTile]
											+ tileCornerHeight[storeyIxd][xTile][yTile + 1]
											+ tileCornerHeight[storeyIxd][xTile + 1][yTile + 1]) / 4
											- (tileCornerHeight[storey][xTileProvided][yTileProvided] + tileCornerHeight[storey][xTileProvided + 1][yTileProvided]
													+ tileCornerHeight[storey][xTileProvided][yTileProvided + 1]
													+ tileCornerHeight[storey][xTileProvided + 1][yTileProvided + 1]) / 4;
									Class10 class10 = tile.aClass10_1313;
									if (class10 != null && class10.aClass30_Sub2_Sub4_278 != null
											&& class10.aClass30_Sub2_Sub4_278.aClass33Array1425 != null)
									{
										method308(class30_sub2_sub4_sub6,
												(Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_278,
												(xTile - xTileProvided) * 128 + (1 - nbrXTiles) * 64, i3, (yTile - yTileProvided) * 128 + (1 - nbrYTiles) * 64,
												flag);
									}
									if (class10 != null && class10.aClass30_Sub2_Sub4_279 != null
											&& class10.aClass30_Sub2_Sub4_279.aClass33Array1425 != null)
									{
										method308(class30_sub2_sub4_sub6,
												(Class30_Sub2_Sub4_Sub6) class10.aClass30_Sub2_Sub4_279,
												(xTile - xTileProvided) * 128 + (1 - nbrXTiles) * 64, i3, (yTile - yTileProvided) * 128 + (1 - nbrYTiles) * 64,
												flag);
									}
									for (int j3 = 0; j3 < tile.anInt1317; j3++)
									{
										Class28 class28 = tile.aClass28Array1318[j3];
										if (class28 != null && class28.aClass30_Sub2_Sub4_521 != null
												&& class28.aClass30_Sub2_Sub4_521.aClass33Array1425 != null)
										{
											int k3 = (class28.anInt524 - class28.anInt523) + 1;
											int l3 = (class28.anInt526 - class28.anInt525) + 1;
											method308(class30_sub2_sub4_sub6,
													(Class30_Sub2_Sub4_Sub6) class28.aClass30_Sub2_Sub4_521,
													(class28.anInt523 - xTileProvided) * 128 + (k3 - nbrXTiles) * 64, i3,
													(class28.anInt525 - yTileProvided) * 128 + (l3 - nbrYTiles) * 64, flag);
										}
									}

								}
							}
						}
					}
				}
				xTileStart--;
				flag = false;
			}
		}
	}

	private void method308(Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6,
			Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1, int i, int j, int k, boolean flag) {
		anInt488++;
		int l = 0;
		int ai[] = class30_sub2_sub4_sub6_1.anIntArray1627;
		int i1 = class30_sub2_sub4_sub6_1.anInt1626;
		for (int j1 = 0; j1 < class30_sub2_sub4_sub6.anInt1626; j1++)
		{
			Class33 class33 = ((Class30_Sub2_Sub4) (class30_sub2_sub4_sub6)).aClass33Array1425[j1];
			Class33 class33_1 = class30_sub2_sub4_sub6.aClass33Array1660[j1];
			if (class33_1.anInt605 != 0)
			{
				int i2 = class30_sub2_sub4_sub6.anIntArray1628[j1] - j;
				if (i2 <= class30_sub2_sub4_sub6_1.anInt1651)
				{
					int j2 = class30_sub2_sub4_sub6.anIntArray1627[j1] - i;
					if (j2 >= class30_sub2_sub4_sub6_1.anInt1646 && j2 <= class30_sub2_sub4_sub6_1.anInt1647)
					{
						int k2 = class30_sub2_sub4_sub6.anIntArray1629[j1] - k;
						if (k2 >= class30_sub2_sub4_sub6_1.anInt1649 && k2 <= class30_sub2_sub4_sub6_1.anInt1648)
						{
							for (int l2 = 0; l2 < i1; l2++)
							{
								Class33 class33_2 = ((Class30_Sub2_Sub4) (class30_sub2_sub4_sub6_1)).aClass33Array1425[l2];
								Class33 class33_3 = class30_sub2_sub4_sub6_1.aClass33Array1660[l2];
								if (j2 == ai[l2] && k2 == class30_sub2_sub4_sub6_1.anIntArray1629[l2]
										&& i2 == class30_sub2_sub4_sub6_1.anIntArray1628[l2]
										&& class33_3.anInt605 != 0)
								{
									class33.anInt602 += class33_3.anInt602;
									class33.anInt603 += class33_3.anInt603;
									class33.anInt604 += class33_3.anInt604;
									class33.anInt605 += class33_3.anInt605;
									class33_2.anInt602 += class33_1.anInt602;
									class33_2.anInt603 += class33_1.anInt603;
									class33_2.anInt604 += class33_1.anInt604;
									class33_2.anInt605 += class33_1.anInt605;
									l++;
									anIntArray486[j1] = anInt488;
									anIntArray487[l2] = anInt488;
								}
							}

						}
					}
				}
			}
		}

		if (l < 3 || !flag)
			return;
		for (int k1 = 0; k1 < class30_sub2_sub4_sub6.anInt1630; k1++)
		{
			if (anIntArray486[class30_sub2_sub4_sub6.anIntArray1631[k1]] == anInt488
					&& anIntArray486[class30_sub2_sub4_sub6.anIntArray1632[k1]] == anInt488
					&& anIntArray486[class30_sub2_sub4_sub6.anIntArray1633[k1]] == anInt488)
			{
				class30_sub2_sub4_sub6.anIntArray1637[k1] = -1;
			}
		}
		for (int l1 = 0; l1 < class30_sub2_sub4_sub6_1.anInt1630; l1++)
		{
			if (anIntArray487[class30_sub2_sub4_sub6_1.anIntArray1631[l1]] == anInt488
					&& anIntArray487[class30_sub2_sub4_sub6_1.anIntArray1632[l1]] == anInt488
					&& anIntArray487[class30_sub2_sub4_sub6_1.anIntArray1633[l1]] == anInt488)
			{
				class30_sub2_sub4_sub6_1.anIntArray1637[l1] = -1;
			}
		}
	}

	public void method309(int ai[], int i, int j, int storey, int xTile, int yTile) {
		Class30_Sub3 tile = tilesForAllStoreys[storey][xTile][yTile];
		if (tile == null)
			return;
		Class43 class43 = tile.aClass43_1311;
		if (class43 != null) {
			int j1 = class43.anInt722;
			if (j1 == 0)
				return;
			for (int k1 = 0; k1 < 4; k1++) {
				ai[i] = j1;
				ai[i + 1] = j1;
				ai[i + 2] = j1;
				ai[i + 3] = j1;
				i += j;
			}

			return;
		}
		Class40 class40 = tile.aClass40_1312;
		if (class40 == null)
			return;
		int l1 = class40.anInt684;
		int i2 = class40.anInt685;
		int j2 = class40.anInt686;
		int k2 = class40.anInt687;
		int ai1[] = anIntArrayArray489[l1];
		int ai2[] = anIntArrayArray490[i2];
		int l2 = 0;
		if (j2 != 0) {
			for (int i3 = 0; i3 < 4; i3++) {
				ai[i] = ai1[ai2[l2++]] != 0 ? k2 : j2;
				ai[i + 1] = ai1[ai2[l2++]] != 0 ? k2 : j2;
				ai[i + 2] = ai1[ai2[l2++]] != 0 ? k2 : j2;
				ai[i + 3] = ai1[ai2[l2++]] != 0 ? k2 : j2;
				i += j;
			}

			return;
		}
		for (int j3 = 0; j3 < 4; j3++) {
			if (ai1[ai2[l2++]] != 0)
				ai[i] = k2;
			if (ai1[ai2[l2++]] != 0)
				ai[i + 1] = k2;
			if (ai1[ai2[l2++]] != 0)
				ai[i + 2] = k2;
			if (ai1[ai2[l2++]] != 0)
				ai[i + 3] = k2;
			i += j;
		}

	}

	public static void method310(int i, int j, int k, int l, int ai[], boolean flag) {
		anInt495 = 0;
		anInt496 = 0;
		anInt497 = k;
		anInt498 = l;
		anInt493 = k / 2;
		anInt494 = l / 2;
		boolean aflag[][][][] = new boolean[9][32][2 * (viewDistance + 1) + 1][2 * (viewDistance + 1) + 1];
		if (flag)
			anInt433 = 168;
		for (int i1 = 128; i1 <= 384; i1 += 32)
		{
			for (int j1 = 0; j1 < 2048; j1 += 64)
			{
				anInt458 = Class30_Sub2_Sub4_Sub6.anIntArray1689[i1];
				anInt459 = Class30_Sub2_Sub4_Sub6.anIntArray1690[i1];
				anInt460 = Class30_Sub2_Sub4_Sub6.anIntArray1689[j1];
				anInt461 = Class30_Sub2_Sub4_Sub6.anIntArray1690[j1];
				int cameraAngleVert = (i1 - 128) / 32;
				int cameraAngleHoriz = j1 / 64;
				for (int xTile = -(viewDistance + 1); xTile <= (viewDistance + 1); xTile++)
				{
					for (int yTile = -(viewDistance + 1); yTile <= (viewDistance + 1); yTile++)
					{
						int xPix = xTile * 128;
						int yPix = yTile * 128;
						boolean isVisible = false;
						for (int k4 = -i; k4 <= j; k4 += 128)
						{
							if (!method311((byte) 9, ai[cameraAngleVert] + k4, yPix, xPix))
								continue;
							isVisible = true;
							break;
						}

						aflag[cameraAngleVert][cameraAngleHoriz][xTile + (viewDistance + 1)][yTile
								+ (viewDistance + 1)] = isVisible;
					}

				}

			}

		}

		for (int cameraAngleVert = 0; cameraAngleVert < verticalCameraAngles; cameraAngleVert++)
		{
			for (int cameraAngleHoriz = 0; cameraAngleHoriz < horizontalCameraAngles; cameraAngleHoriz++)
			{
				for (int xTile = -viewDistance; xTile < viewDistance; xTile++)
				{
					for (int yTile = -viewDistance; yTile < viewDistance; yTile++)
					{
						/*
						 * Find the boundaries of what tiles are shown from
						 * which angle.
						 */
						boolean isVisible = false;
						label0: for (int nearestXTiles = -1; nearestXTiles <= 1; nearestXTiles++)
						{
							for (int nearestYTiles = -1; nearestYTiles <= 1; nearestYTiles++)
							{
								if (aflag[cameraAngleVert][cameraAngleHoriz][xTile + nearestXTiles
										+ (viewDistance + 1)][yTile + nearestYTiles
												+ (viewDistance + 1)])
								{
									isVisible = true;
								} else if (aflag[cameraAngleVert][(cameraAngleHoriz + 1)
										% (horizontalCameraAngles - 1)][xTile + nearestXTiles
												+ (viewDistance + 1)][yTile + nearestYTiles
														+ (viewDistance + 1)])
								{
									isVisible = true;
								} else if (aflag[cameraAngleVert + 1][cameraAngleHoriz][xTile
										+ nearestXTiles + (viewDistance + 1)][yTile
												+ nearestYTiles + (viewDistance + 1)])
								{
									isVisible = true;
								} else
								{
									if (!aflag[cameraAngleVert + 1][(cameraAngleHoriz + 1)
											% (horizontalCameraAngles - 1)][xTile + nearestXTiles
													+ (viewDistance + 1)][yTile + nearestYTiles
															+ (viewDistance + 1)])
										continue;
									isVisible = true;
								}
								break label0;
							}

						}

						tileVisible[cameraAngleVert][cameraAngleHoriz][xTile + viewDistance][yTile
								+ viewDistance] = isVisible;
					}

				}

			}

		}

	}

	/**
	 * Calculates wether or not the current tile should be visible or not.
	 * 
	 * @param byte0
	 * @param i
	 * @param j
	 * @param k
	 * @return
	 */
	public static boolean method311(byte byte0, int i, int j, int k) {
		int l = j * anInt460 + k * anInt461 >> 16;
		int i1 = j * anInt461 - k * anInt460 >> 16;
		if (byte0 != 9)
			anInt431 = -346;
		int j1 = i * anInt458 + i1 * anInt459 >> 16;
		int k1 = i * anInt459 - i1 * anInt458 >> 16;
		if (j1 < 50 || j1 > 3500)
			return false;
		int l1 = anInt493 + (l << 9) / j1;
		int i2 = anInt494 + (k1 << 9) / j1;
		return l1 >= anInt495 && l1 <= anInt497 && i2 >= anInt496 && i2 <= anInt498;
	}

	public void method312(boolean flag, int i, int j) {
		aBoolean467 = true;
		anInt468 = j;
		anInt469 = i;
		anInt470 = -1;
		anInt471 = -1;
		if (flag) {
			for (int k = 1; k > 0; k++)
				;
		}
	}

	public void method313(int playerPosXPix, int playerPosYPix, int k, int cameraHeight, int i1, int j1, boolean flag) {
		if (playerPosXPix < 0)
			playerPosXPix = 0;
		else if (playerPosXPix >= totNbrXTiles * 128)
			playerPosXPix = totNbrXTiles * 128 - 1;
		if (playerPosYPix < 0)
			playerPosYPix = 0;
		else if (playerPosYPix >= totNbrYTiles * 128)
			playerPosYPix = totNbrYTiles * 128 - 1;
		anInt448++;
		anInt458 = Class30_Sub2_Sub4_Sub6.anIntArray1689[j1];
		anInt459 = Class30_Sub2_Sub4_Sub6.anIntArray1690[j1];
		if (flag)
			return;
		anInt460 = Class30_Sub2_Sub4_Sub6.anIntArray1689[k];
		anInt461 = Class30_Sub2_Sub4_Sub6.anIntArray1690[k];
		tilesVisibleForThisAngle = tileVisible[(j1 - 128) / 32][k / 64];
		cameraFocusXPix = playerPosXPix;
		cameraPosHeight = cameraHeight;
		cameraPosYPix = playerPosYPix;
		cameraFocusXTile = playerPosXPix / 128;
		cameraFocusYTile = playerPosYPix / 128;
		anInt447 = i1;
		xMinTile = cameraFocusXTile - viewDistance;
		if (xMinTile < 0)
			xMinTile = 0;
		yMinTile = cameraFocusYTile - viewDistance;
		if (yMinTile < 0)
			yMinTile = 0;
		xMaxTile = cameraFocusXTile + viewDistance;
		if (xMaxTile > totNbrXTiles)
			xMaxTile = totNbrXTiles;
		yMaxTile = cameraFocusYTile + viewDistance;
		if (yMaxTile > totNbrYTiles)
			yMaxTile = totNbrYTiles;
		method319(0);
		anInt446 = 0;
		/* This loop repaints the game frame the game frame */
		long lng = System.currentTimeMillis();
		for (int storey = lowestStorey; storey < highestStorey; storey++)
		{
			Class30_Sub3 tilesForThisStorey[][] = tilesForAllStoreys[storey];
			for (int xTile = xMinTile; xTile < xMaxTile; xTile++)
			{
				for (int yTile = yMinTile; yTile < yMaxTile; yTile++)
				{
					Class30_Sub3 tile = tilesForThisStorey[xTile][yTile];
					if (tile != null)
					{
						if (tile.anInt1321 > i1 || !tilesVisibleForThisAngle[(xTile - cameraFocusXTile)
								+ viewDistance][(yTile - cameraFocusYTile) + viewDistance]
								&& tileCornerHeight[storey][xTile][yTile] - cameraHeight < 2000)
						{
							tile.aBoolean1322 = false;
							tile.aBoolean1323 = false;
							tile.anInt1325 = 0;
						} else
						{
							tile.aBoolean1322 = true;
							tile.aBoolean1323 = true;
							if (tile.anInt1317 > 0)
							{
								tile.aBoolean1324 = true;
							}
							else
							{
								tile.aBoolean1324 = false;
							}
							anInt446++;
						}
					}
				}

			}
		}
		/*
		 * This loop does not seem to have an immediate impact on updating the
		 * game frame
		 */
		for (int storey = lowestStorey; storey < highestStorey; storey++)
		{
			Class30_Sub3 tilesForThisStorey[][] = tilesForAllStoreys[storey];
			for (int l2 = -viewDistance; l2 <= 0; l2++)
			{
				int xTileEast = cameraFocusXTile + l2;
				int xTileWest = cameraFocusXTile - l2;
				if (xTileEast >= xMinTile || xTileWest < xMaxTile)
				{
					for (int yTile = -viewDistance; yTile <= 0; yTile++)
					{
						int yTileSouth = cameraFocusYTile + yTile;
						int yTileNorth = cameraFocusYTile - yTile;
						if (xTileEast >= xMinTile)
						{
							if (yTileSouth >= yMinTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileEast][yTileSouth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, true);
								}
							}
							if (yTileNorth < yMaxTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileEast][yTileNorth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, true);
								}
							}
						}
						if (xTileWest < xMaxTile)
						{
							if (yTileSouth >= yMinTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileWest][yTileSouth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, true);
								}
							}
							if (yTileNorth < yMaxTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileWest][yTileNorth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, true);
								}
							}
						}
						if (anInt446 == 0)
						{
							aBoolean467 = false;
							return;
						}
					}

				}
			}
		}
		/*
		 * This loop does not seem to have an immediate impact on updating the
		 * game frame
		 */
		for (int storey = lowestStorey; storey < highestStorey; storey++)
		{
			Class30_Sub3 tilesForThisStorey[][] = tilesForAllStoreys[storey];
			for (int xTile = -viewDistance; xTile <= 0; xTile++)
			{
				int xTileEast = cameraFocusXTile + xTile;
				int xTileWest = cameraFocusXTile - xTile;
				if (xTileEast >= xMinTile || xTileWest < xMaxTile)
				{
					for (int yTile = -viewDistance; yTile <= 0; yTile++)
					{
						int yTileSouth = cameraFocusYTile + yTile;
						int yTileNorth = cameraFocusYTile - yTile;
						if (xTileEast >= xMinTile)
						{
							if (yTileSouth >= yMinTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileEast][yTileSouth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, false);
								}
							}
							if (yTileNorth < yMaxTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileEast][yTileNorth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, false);
								}
							}
						}
						if (xTileWest < xMaxTile)
						{
							if (yTileSouth >= yMinTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileWest][yTileSouth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, false);
								}
							}
							if (yTileNorth < yMaxTile)
							{
								Class30_Sub3 tile = tilesForThisStorey[xTileWest][yTileNorth];
								if (tile != null && tile.aBoolean1322)
								{
									method314(tile, false);
								}
							}
						}
						if (anInt446 == 0)
						{
							aBoolean467 = false;
							return;
						}
					}

				}
			}
		}

		aBoolean467 = false;
	}

	public void method314(Class30_Sub3 class30_sub3, boolean flag) {
		aClass19_477.method249(class30_sub3);
		do
		{
			Class30_Sub3 class30_sub3_1;
			do
			{
				class30_sub3_1 = (Class30_Sub3) aClass19_477.method251();
				if (class30_sub3_1 == null)
					return;
			} while (!class30_sub3_1.aBoolean1323);
			int xTile = class30_sub3_1.tileXPos;
			int yTile = class30_sub3_1.tileYPos;
			int storey = class30_sub3_1.anInt1307;
			int l = class30_sub3_1.anInt1310;
			Class30_Sub3 tilesForThisStorey[][] = tilesForAllStoreys[storey];
			if (class30_sub3_1.aBoolean1322)
			{
				if (flag)
				{
					if (storey > 0)
					{
						Class30_Sub3 tilesForCurrentStory = tilesForAllStoreys[storey - 1][xTile][yTile];
						if (tilesForCurrentStory != null && tilesForCurrentStory.aBoolean1323)
							continue;
					}
					if (xTile <= cameraFocusXTile && xTile > xMinTile)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile - 1][yTile];
						if (tile != null && tile.aBoolean1323
								&& (tile.aBoolean1322 || (class30_sub3_1.anInt1320 & 1) == 0))
							continue;
					}
					if (xTile >= cameraFocusXTile && xTile < xMaxTile - 1)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile + 1][yTile];
						if (tile != null && tile.aBoolean1323
								&& (tile.aBoolean1322 || (class30_sub3_1.anInt1320 & 4) == 0))
							continue;
					}
					if (yTile <= cameraFocusYTile && yTile > yMinTile)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile][yTile - 1];
						if (tile != null && tile.aBoolean1323
								&& (tile.aBoolean1322 || (class30_sub3_1.anInt1320 & 8) == 0))
							continue;
					}
					if (yTile >= cameraFocusYTile && yTile < yMaxTile - 1)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile][yTile + 1];
						if (tile != null && tile.aBoolean1323
								&& (tile.aBoolean1322 || (class30_sub3_1.anInt1320 & 2) == 0))
							continue;
					}
				}
				else
				{
					flag = true;
				}
				class30_sub3_1.aBoolean1322 = false;
				
				if (class30_sub3_1.aClass30_Sub3_1329 != null)
				{
					Class30_Sub3 class30_sub3_7 = class30_sub3_1.aClass30_Sub3_1329;
					if (class30_sub3_7.aClass43_1311 != null)
					{
						if (!method320(0, xTile, yTile))
						{
							method315(class30_sub3_7.aClass43_1311, 0, anInt458, anInt459, anInt460, anInt461, xTile, yTile);
						}
					}
					else if (class30_sub3_7.aClass40_1312 != null && !method320(0, xTile, yTile))
					{
						method316(xTile, (byte) 99, anInt458, anInt460, class30_sub3_7.aClass40_1312, anInt459, yTile, anInt461);
					}
					Class10 class10 = class30_sub3_7.aClass10_1313;
					
					if (class10 != null)
					{
						class10.aClass30_Sub2_Sub4_278.method443(0, anInt458, anInt459, anInt460, anInt461,
								class10.anInt274 - cameraFocusXPix, class10.anInt273 - cameraPosHeight,
								class10.anInt275 - cameraPosYPix, class10.anInt280);
					}
					for (int i2 = 0; i2 < class30_sub3_7.anInt1317; i2++)
					{
						Class28 class28 = class30_sub3_7.aClass28Array1318[i2];
						if (class28 != null)
						{
							class28.aClass30_Sub2_Sub4_521.method443(class28.anInt522, anInt458, anInt459, anInt460,
									anInt461, class28.anInt519 - cameraFocusXPix, class28.anInt518 - cameraPosHeight,
									class28.anInt520 - cameraPosYPix, class28.anInt529);
						}
					}

				}
				boolean flag1 = false;
				
				if (class30_sub3_1.aClass43_1311 != null)
				{
					/* looks like this draws the tiles that only have one type of texture
					 * under them, e.g. grass and road.
					 * 
					 */
					if (!method320(l, xTile, yTile))
					{
						flag1 = true;
						method315(class30_sub3_1.aClass43_1311, l, anInt458, anInt459, anInt460, anInt461, xTile, yTile);
					}
				}
				else if (class30_sub3_1.aClass40_1312 != null && !method320(l, xTile, yTile))
				{
					/* looks like this draws the tiles that have more than one type of texture
					 * under them, e.g. the border between road and grass.
					 */
					flag1 = true;
					method316(xTile, (byte) 99, anInt458, anInt460, class30_sub3_1.aClass40_1312, anInt459, yTile, anInt461);
				}
				int j1 = 0;
				int j2 = 0;
				Class10 class10_3 = class30_sub3_1.aClass10_1313;
				Class26 class26_1 = class30_sub3_1.aClass26_1314;
				if (class10_3 != null || class26_1 != null)
				{
					if (cameraFocusXTile == xTile)
						j1++;
					else if (cameraFocusXTile < xTile)
						j1 += 2;
					if (cameraFocusYTile == yTile)
						j1 += 3;
					else if (cameraFocusYTile > yTile)
						j1 += 6;
					j2 = anIntArray478[j1];
					class30_sub3_1.anInt1328 = anIntArray480[j1];
				}
				if (class10_3 != null)
				{
					if ((class10_3.anInt276 & anIntArray479[j1]) != 0)
					{
						if (class10_3.anInt276 == 16)
						{
							class30_sub3_1.anInt1325 = 3;
							class30_sub3_1.anInt1326 = anIntArray481[j1];
							class30_sub3_1.anInt1327 = 3 - class30_sub3_1.anInt1326;
						}
						else if (class10_3.anInt276 == 32)
						{
							class30_sub3_1.anInt1325 = 6;
							class30_sub3_1.anInt1326 = anIntArray482[j1];
							class30_sub3_1.anInt1327 = 6 - class30_sub3_1.anInt1326;
						}
						else if (class10_3.anInt276 == 64)
						{
							class30_sub3_1.anInt1325 = 12;
							class30_sub3_1.anInt1326 = anIntArray483[j1];
							class30_sub3_1.anInt1327 = 12 - class30_sub3_1.anInt1326;
						}
						else
						{
							class30_sub3_1.anInt1325 = 9;
							class30_sub3_1.anInt1326 = anIntArray484[j1];
							class30_sub3_1.anInt1327 = 9 - class30_sub3_1.anInt1326;
						}
					}
					else
					{
						class30_sub3_1.anInt1325 = 0;
					}
					if ((class10_3.anInt276 & j2) != 0 && !method321(l, xTile, yTile, class10_3.anInt276))
					{
						class10_3.aClass30_Sub2_Sub4_278.method443(0, anInt458, anInt459, anInt460, anInt461,
								class10_3.anInt274 - cameraFocusXPix, class10_3.anInt273 - cameraPosHeight,
								class10_3.anInt275 - cameraPosYPix, class10_3.anInt280);
					}
					if ((class10_3.anInt277 & j2) != 0 && !method321(l, xTile, yTile, class10_3.anInt277))
					{
						class10_3.aClass30_Sub2_Sub4_279.method443(0, anInt458, anInt459, anInt460, anInt461,
								class10_3.anInt274 - cameraFocusXPix, class10_3.anInt273 - cameraPosHeight,
								class10_3.anInt275 - cameraPosYPix, class10_3.anInt280);
					}
				}
				if (class26_1 != null && !method322(l, xTile, yTile, class26_1.aClass30_Sub2_Sub4_504.anInt1426))
				{
					if ((class26_1.anInt502 & j2) != 0)
					{
						class26_1.aClass30_Sub2_Sub4_504.method443(class26_1.anInt503, anInt458, anInt459, anInt460,
								anInt461, class26_1.anInt500 - cameraFocusXPix, class26_1.anInt499 - cameraPosHeight,
								class26_1.anInt501 - cameraPosYPix, class26_1.anInt505);
					}
					else if ((class26_1.anInt502 & 0x300) != 0)
					{
						int j4 = class26_1.anInt500 - cameraFocusXPix;
						int l5 = class26_1.anInt499 - cameraPosHeight;
						int k6 = class26_1.anInt501 - cameraPosYPix;
						int i8 = class26_1.anInt503;
						int k9;
						if (i8 == 1 || i8 == 2)
							k9 = -j4;
						else
							k9 = j4;
						int k10;
						if (i8 == 2 || i8 == 3)
							k10 = -k6;
						else
							k10 = k6;
						if ((class26_1.anInt502 & 0x100) != 0 && k10 < k9)
						{
							int i11 = j4 + anIntArray463[i8];
							int k11 = k6 + anIntArray464[i8];
							class26_1.aClass30_Sub2_Sub4_504.method443(i8 * 512 + 256, anInt458, anInt459, anInt460,
									anInt461, i11, l5, k11, class26_1.anInt505);
						}
						if ((class26_1.anInt502 & 0x200) != 0 && k10 > k9)
						{
							int j11 = j4 + anIntArray465[i8];
							int l11 = k6 + anIntArray466[i8];
							class26_1.aClass30_Sub2_Sub4_504.method443(i8 * 512 + 1280 & 0x7ff, anInt458, anInt459,
									anInt460, anInt461, j11, l5, l11, class26_1.anInt505);
						}
					}
				}
				if (flag1)
				{
					Class49 class49 = class30_sub3_1.aClass49_1315;
					if (class49 != null)
					{
						class49.aClass30_Sub2_Sub4_814.method443(0, anInt458, anInt459, anInt460, anInt461,
								class49.anInt812 - cameraFocusXPix, class49.anInt811 - cameraPosHeight,
								class49.anInt813 - cameraPosYPix, class49.anInt815);
					}
					Class3 class3_1 = class30_sub3_1.aClass3_1316;
					if (class3_1 != null && class3_1.anInt52 == 0)
					{
						if (class3_1.aClass30_Sub2_Sub4_49 != null)
						{
							class3_1.aClass30_Sub2_Sub4_49.method443(0, anInt458, anInt459, anInt460, anInt461,
									class3_1.anInt46 - cameraFocusXPix, class3_1.anInt45 - cameraPosHeight,
									class3_1.anInt47 - cameraPosYPix, class3_1.anInt51);
						}
						if (class3_1.aClass30_Sub2_Sub4_50 != null)
						{
							class3_1.aClass30_Sub2_Sub4_50.method443(0, anInt458, anInt459, anInt460, anInt461,
									class3_1.anInt46 - cameraFocusXPix, class3_1.anInt45 - cameraPosHeight,
									class3_1.anInt47 - cameraPosYPix, class3_1.anInt51);
						}
						if (class3_1.aClass30_Sub2_Sub4_48 != null)
						{
							class3_1.aClass30_Sub2_Sub4_48.method443(0, anInt458, anInt459, anInt460, anInt461,
									class3_1.anInt46 - cameraFocusXPix, class3_1.anInt45 - cameraPosHeight,
									class3_1.anInt47 - cameraPosYPix, class3_1.anInt51);
						}
					}
				}
				int k4 = class30_sub3_1.anInt1320;
				if (k4 != 0)
				{
					if (xTile < cameraFocusXTile && (k4 & 4) != 0)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile + 1][yTile];
						if (tile != null && tile.aBoolean1323)
							aClass19_477.method249(tile);
					}
					if (yTile < cameraFocusYTile && (k4 & 2) != 0)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile][yTile + 1];
						if (tile != null && tile.aBoolean1323)
							aClass19_477.method249(tile);
					}
					if (xTile > cameraFocusXTile && (k4 & 1) != 0)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile - 1][yTile];
						if (tile != null && tile.aBoolean1323)
							aClass19_477.method249(tile);
					}
					if (yTile > cameraFocusYTile && (k4 & 8) != 0)
					{
						Class30_Sub3 tile = tilesForThisStorey[xTile][yTile - 1];
						if (tile != null && tile.aBoolean1323)
							aClass19_477.method249(tile);
					}
				}
			}
			if (class30_sub3_1.anInt1325 != 0)
			{
				boolean flag2 = true;
				for (int k1 = 0; k1 < class30_sub3_1.anInt1317; k1++)
				{
					if (class30_sub3_1.aClass28Array1318[k1].anInt528 == anInt448
							|| (class30_sub3_1.anIntArray1319[k1] & class30_sub3_1.anInt1325) != class30_sub3_1.anInt1326)
						continue;
					flag2 = false;
					break;
				}
				if (flag2)
				{
					Class10 class10_1 = class30_sub3_1.aClass10_1313;
					if (!method321(l, xTile, yTile, class10_1.anInt276))
					{
						class10_1.aClass30_Sub2_Sub4_278.method443(0, anInt458, anInt459, anInt460, anInt461,
								class10_1.anInt274 - cameraFocusXPix, class10_1.anInt273 - cameraPosHeight,
								class10_1.anInt275 - cameraPosYPix, class10_1.anInt280);
					}
					class30_sub3_1.anInt1325 = 0;
				}
			}
			if (class30_sub3_1.aBoolean1324)
			{
				try
				{
					int i1 = class30_sub3_1.anInt1317;
					class30_sub3_1.aBoolean1324 = false;
					int l1 = 0;
					label0:
						for (int k2 = 0; k2 < i1; k2++)
						{
							Class28 class28_1 = class30_sub3_1.aClass28Array1318[k2];
							if (class28_1.anInt528 == anInt448)
								continue;
							for (int k3 = class28_1.anInt523; k3 <= class28_1.anInt524; k3++)
							{
								for (int l4 = class28_1.anInt525; l4 <= class28_1.anInt526; l4++)
								{
									Class30_Sub3 class30_sub3_21 = tilesForThisStorey[k3][l4];
									if (class30_sub3_21.aBoolean1322)
									{
										class30_sub3_1.aBoolean1324 = true;
									}
									else
									{
										if (class30_sub3_21.anInt1325 == 0)
											continue;
										int l6 = 0;
										if (k3 > class28_1.anInt523)
											l6++;
										if (k3 < class28_1.anInt524)
											l6 += 4;
										if (l4 > class28_1.anInt525)
											l6 += 8;
										if (l4 < class28_1.anInt526)
											l6 += 2;
										if ((l6 & class30_sub3_21.anInt1325) != class30_sub3_1.anInt1327)
											continue;
										class30_sub3_1.aBoolean1324 = true;
									}
									continue label0;
								}

							}

							aClass28Array462[l1++] = class28_1;
							int i5 = cameraFocusXTile - class28_1.anInt523;
							int i6 = class28_1.anInt524 - cameraFocusXTile;
							if (i6 > i5)
								i5 = i6;
							int i7 = cameraFocusYTile - class28_1.anInt525;
							int j8 = class28_1.anInt526 - cameraFocusYTile;
							if (j8 > i7)
								class28_1.anInt527 = i5 + j8;
							else
								class28_1.anInt527 = i5 + i7;
						}
					while (l1 > 0)
					{
						int i3 = -50;
						int l3 = -1;
						for (int j5 = 0; j5 < l1; j5++)
						{
							Class28 class28_2 = aClass28Array462[j5];
							if (class28_2.anInt528 != anInt448)
								if (class28_2.anInt527 > i3)
								{
									i3 = class28_2.anInt527;
									l3 = j5;
								}
								else if (class28_2.anInt527 == i3)
								{
									int j7 = class28_2.anInt519 - cameraFocusXPix;
									int k8 = class28_2.anInt520 - cameraPosYPix;
									int l9 = aClass28Array462[l3].anInt519 - cameraFocusXPix;
									int l10 = aClass28Array462[l3].anInt520 - cameraPosYPix;
									if (j7 * j7 + k8 * k8 > l9 * l9 + l10 * l10)
										l3 = j5;
								}
						}

						if (l3 == -1)
							break;
						Class28 class28_3 = aClass28Array462[l3];
						class28_3.anInt528 = anInt448;
						if (!method323(l, class28_3.anInt523, class28_3.anInt524, class28_3.anInt525,
								class28_3.anInt526, class28_3.aClass30_Sub2_Sub4_521.anInt1426))
						{
							class28_3.aClass30_Sub2_Sub4_521.method443(class28_3.anInt522, anInt458, anInt459, anInt460,
									anInt461, class28_3.anInt519 - cameraFocusXPix, class28_3.anInt518 - cameraPosHeight,
									class28_3.anInt520 - cameraPosYPix, class28_3.anInt529);
						}
						for (int k7 = class28_3.anInt523; k7 <= class28_3.anInt524; k7++)
						{
							for (int l8 = class28_3.anInt525; l8 <= class28_3.anInt526; l8++)
							{
								Class30_Sub3 tile = tilesForThisStorey[k7][l8];
								if (tile.anInt1325 != 0)
									aClass19_477.method249(tile);
								else if ((k7 != xTile || l8 != yTile) && tile.aBoolean1323)
									aClass19_477.method249(tile);
							}

						}

					}
					if (class30_sub3_1.aBoolean1324)
						continue;
				}
				catch (Exception _ex)
				{
					class30_sub3_1.aBoolean1324 = false;
				}
			}
			if (!class30_sub3_1.aBoolean1323 || class30_sub3_1.anInt1325 != 0)
				continue;
			if (xTile <= cameraFocusXTile && xTile > xMinTile)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile - 1][yTile];
				if (tile != null && tile.aBoolean1323)
					continue;
			}
			if (xTile >= cameraFocusXTile && xTile < xMaxTile - 1)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile + 1][yTile];
				if (tile != null && tile.aBoolean1323)
					continue;
			}
			if (yTile <= cameraFocusYTile && yTile > yMinTile)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile][yTile - 1];
				if (tile != null && tile.aBoolean1323)
					continue;
			}
			if (yTile >= cameraFocusYTile && yTile < yMaxTile - 1)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile][yTile + 1];
				if (tile != null && tile.aBoolean1323)
					continue;
			}
			class30_sub3_1.aBoolean1323 = false;
			anInt446--;
			Class3 class3 = class30_sub3_1.aClass3_1316;
			if (class3 != null && class3.anInt52 != 0)
			{
				if (class3.aClass30_Sub2_Sub4_49 != null)
				{
					class3.aClass30_Sub2_Sub4_49.method443(0, anInt458, anInt459, anInt460, anInt461,
							class3.anInt46 - cameraFocusXPix, class3.anInt45 - cameraPosHeight - class3.anInt52,
							class3.anInt47 - cameraPosYPix, class3.anInt51);
				}
				if (class3.aClass30_Sub2_Sub4_50 != null)
				{
					class3.aClass30_Sub2_Sub4_50.method443(0, anInt458, anInt459, anInt460, anInt461,
							class3.anInt46 - cameraFocusXPix, class3.anInt45 - cameraPosHeight - class3.anInt52,
							class3.anInt47 - cameraPosYPix, class3.anInt51);
				}
				if (class3.aClass30_Sub2_Sub4_48 != null)
				{
					class3.aClass30_Sub2_Sub4_48.method443(0, anInt458, anInt459, anInt460, anInt461,
							class3.anInt46 - cameraFocusXPix, class3.anInt45 - cameraPosHeight - class3.anInt52,
							class3.anInt47 - cameraPosYPix, class3.anInt51);
				}
			}
			if (class30_sub3_1.anInt1328 != 0)
			{
				Class26 class26 = class30_sub3_1.aClass26_1314;
				if (class26 != null && !method322(l, xTile, yTile, class26.aClass30_Sub2_Sub4_504.anInt1426))
				{
					if ((class26.anInt502 & class30_sub3_1.anInt1328) != 0)
					{
						class26.aClass30_Sub2_Sub4_504.method443(class26.anInt503, anInt458, anInt459, anInt460,
								anInt461, class26.anInt500 - cameraFocusXPix, class26.anInt499 - cameraPosHeight,
								class26.anInt501 - cameraPosYPix, class26.anInt505);
					}
					else if ((class26.anInt502 & 0x300) != 0)
					{
						int l2 = class26.anInt500 - cameraFocusXPix;
						int j3 = class26.anInt499 - cameraPosHeight;
						int i4 = class26.anInt501 - cameraPosYPix;
						int k5 = class26.anInt503;
						int j6;
						if (k5 == 1 || k5 == 2)
							j6 = -l2;
						else
							j6 = l2;
						int l7;
						if (k5 == 2 || k5 == 3)
							l7 = -i4;
						else
							l7 = i4;
						if ((class26.anInt502 & 0x100) != 0 && l7 >= j6)
						{
							int i9 = l2 + anIntArray463[k5];
							int i10 = i4 + anIntArray464[k5];
							class26.aClass30_Sub2_Sub4_504.method443(k5 * 512 + 256, anInt458, anInt459, anInt460,
									anInt461, i9, j3, i10, class26.anInt505);
						}
						if ((class26.anInt502 & 0x200) != 0 && l7 <= j6)
						{
							int j9 = l2 + anIntArray465[k5];
							int j10 = i4 + anIntArray466[k5];
							class26.aClass30_Sub2_Sub4_504.method443(k5 * 512 + 1280 & 0x7ff, anInt458, anInt459,
									anInt460, anInt461, j9, j3, j10, class26.anInt505);
						}
					}
				}
				Class10 class10_2 = class30_sub3_1.aClass10_1313;
				if (class10_2 != null)
				{
					if ((class10_2.anInt277 & class30_sub3_1.anInt1328) != 0 && !method321(l, xTile, yTile, class10_2.anInt277))
					{
						class10_2.aClass30_Sub2_Sub4_279.method443(0, anInt458, anInt459, anInt460, anInt461,
								class10_2.anInt274 - cameraFocusXPix, class10_2.anInt273 - cameraPosHeight,
								class10_2.anInt275 - cameraPosYPix, class10_2.anInt280);
					}
					if ((class10_2.anInt276 & class30_sub3_1.anInt1328) != 0 && !method321(l, xTile, yTile, class10_2.anInt276))
					{
						class10_2.aClass30_Sub2_Sub4_278.method443(0, anInt458, anInt459, anInt460, anInt461,
								class10_2.anInt274 - cameraFocusXPix, class10_2.anInt273 - cameraPosHeight,
								class10_2.anInt275 - cameraPosYPix, class10_2.anInt280);
					}
				}
			}
			if (storey < highestStorey - 1)
			{
				Class30_Sub3 tile = tilesForAllStoreys[storey + 1][xTile][yTile];
				if (tile != null && tile.aBoolean1323)
					aClass19_477.method249(tile);
			}
			if (xTile < cameraFocusXTile)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile + 1][yTile];
				if (tile != null && tile.aBoolean1323)
					aClass19_477.method249(tile);
			}
			if (yTile < cameraFocusYTile)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile][yTile + 1];
				if (tile != null && tile.aBoolean1323)
					aClass19_477.method249(tile);
			}
			if (xTile > cameraFocusXTile)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile - 1][yTile];
				if (tile != null && tile.aBoolean1323)
					aClass19_477.method249(tile);
			}
			if (yTile > cameraFocusYTile)
			{
				Class30_Sub3 tile = tilesForThisStorey[xTile][yTile - 1];
				if (tile != null && tile.aBoolean1323)
					aClass19_477.method249(tile);
			}
		} while (true);
	}

	public void method315(Class43 class43, int storey, int j, int k, int l, int i1, int xTile, int yTile) {
		int l1;
		int i2 = l1 = (xTile << 7) - cameraFocusXPix;
		int j2;
		int k2 = j2 = (yTile << 7) - cameraPosYPix;
		int l2;
		int i3 = l2 = i2 + 128;
		int j3;
		int k3 = j3 = k2 + 128;
		int l3 = tileCornerHeight[storey][xTile][yTile] - cameraPosHeight;
		int i4 = tileCornerHeight[storey][xTile + 1][yTile] - cameraPosHeight;
		int j4 = tileCornerHeight[storey][xTile + 1][yTile + 1] - cameraPosHeight;
		int k4 = tileCornerHeight[storey][xTile][yTile + 1] - cameraPosHeight;
		int l4 = k2 * l + i2 * i1 >> 16;
		k2 = k2 * i1 - i2 * l >> 16;
		i2 = l4;
		l4 = l3 * k - k2 * j >> 16;
		k2 = l3 * j + k2 * k >> 16;
		l3 = l4;
		if (k2 < 50)
			return;
		l4 = j2 * l + i3 * i1 >> 16;
		j2 = j2 * i1 - i3 * l >> 16;
		i3 = l4;
		l4 = i4 * k - j2 * j >> 16;
		j2 = i4 * j + j2 * k >> 16;
		i4 = l4;
		if (j2 < 50)
			return;
		l4 = k3 * l + l2 * i1 >> 16;
		k3 = k3 * i1 - l2 * l >> 16;
		l2 = l4;
		l4 = j4 * k - k3 * j >> 16;
		k3 = j4 * j + k3 * k >> 16;
		j4 = l4;
		if (k3 < 50)
			return;
		l4 = j3 * l + l1 * i1 >> 16;
		j3 = j3 * i1 - l1 * l >> 16;
		l1 = l4;
		l4 = k4 * k - j3 * j >> 16;
		j3 = k4 * j + j3 * k >> 16;
		k4 = l4;
		if (j3 < 50)
			return;
		int i5 = Class30_Sub2_Sub1_Sub3.anInt1466 + (i2 << 9) / k2;
		int j5 = Class30_Sub2_Sub1_Sub3.anInt1467 + (l3 << 9) / k2;
		int k5 = Class30_Sub2_Sub1_Sub3.anInt1466 + (i3 << 9) / j2;
		int l5 = Class30_Sub2_Sub1_Sub3.anInt1467 + (i4 << 9) / j2;
		int i6 = Class30_Sub2_Sub1_Sub3.anInt1466 + (l2 << 9) / k3;
		int j6 = Class30_Sub2_Sub1_Sub3.anInt1467 + (j4 << 9) / k3;
		int k6 = Class30_Sub2_Sub1_Sub3.anInt1466 + (l1 << 9) / j3;
		int l6 = Class30_Sub2_Sub1_Sub3.anInt1467 + (k4 << 9) / j3;
		Class30_Sub2_Sub1_Sub3.anInt1465 = 0;
		
		if ((i6 - k6) * (l5 - l6) - (j6 - l6) * (k5 - k6) > 0)
		{ // north-west triangle of the square
			Class30_Sub2_Sub1_Sub3.aBoolean1462 = false;
			if (i6 < 0 || k6 < 0 || k5 < 0 || i6 > Class30_Sub2_Sub1.endWidthMinusOne
					|| k6 > Class30_Sub2_Sub1.endWidthMinusOne || k5 > Class30_Sub2_Sub1.endWidthMinusOne)
				Class30_Sub2_Sub1_Sub3.aBoolean1462 = true;
			if (aBoolean467 && method318(anInt468, anInt469, j6, l6, l5, i6, k6, k5)) {
				anInt470 = xTile;
				anInt471 = yTile;
			}
			if (class43.anInt720 == -1) {
				
				if (class43.anInt718 != 0xbc614e)
					Class30_Sub2_Sub1_Sub3.method374(j6, l6, l5, i6, k6, k5, class43.anInt718, class43.anInt719,
							class43.anInt717);
			} else if (!aBoolean436) {
				
				if (class43.aBoolean721)
					Class30_Sub2_Sub1_Sub3.method378(j6, l6, l5, i6, k6, k5, class43.anInt718, class43.anInt719,
							class43.anInt717, i2, i3, l1, l3, i4, k4, k2, j2, j3, class43.anInt720);
				else
					Class30_Sub2_Sub1_Sub3.method378(j6, l6, l5, i6, k6, k5, class43.anInt718, class43.anInt719,
							class43.anInt717, l2, l1, i3, j4, k4, i4, k3, j3, j2, class43.anInt720);
			} else {
				
				int i7 = anIntArray485[class43.anInt720];
				Class30_Sub2_Sub1_Sub3.method374(j6, l6, l5, i6, k6, k5, method317(-361, i7, class43.anInt718),
						method317(-361, i7, class43.anInt719), method317(-361, i7, class43.anInt717));
			}
		}
		
		if ((i5 - k5) * (l6 - l5) - (j5 - l5) * (k6 - k5) > 0)
		{ // south-east triangle of the square
			Class30_Sub2_Sub1_Sub3.aBoolean1462 = false;
			if (i5 < 0 || k5 < 0 || k6 < 0 || i5 > Class30_Sub2_Sub1.endWidthMinusOne
					|| k5 > Class30_Sub2_Sub1.endWidthMinusOne || k6 > Class30_Sub2_Sub1.endWidthMinusOne)
				Class30_Sub2_Sub1_Sub3.aBoolean1462 = true;
			if (aBoolean467 && method318(anInt468, anInt469, j5, l5, l6, i5, k5, k6)) {
				anInt470 = xTile;
				anInt471 = yTile;
			}
			if (class43.anInt720 == -1) {
				if (class43.anInt716 != 0xbc614e) {
					Class30_Sub2_Sub1_Sub3.method374(j5, l5, l6, i5, k5, k6, class43.anInt716, class43.anInt717,
							class43.anInt719);
					return;
				}
			} else {
				if (!aBoolean436) {
					Class30_Sub2_Sub1_Sub3.method378(j5, l5, l6, i5, k5, k6, class43.anInt716, class43.anInt717,
							class43.anInt719, i2, i3, l1, l3, i4, k4, k2, j2, j3, class43.anInt720);
					return;
				}
				int j7 = anIntArray485[class43.anInt720];
				Class30_Sub2_Sub1_Sub3.method374(j5, l5, l6, i5, k5, k6, method317(-361, j7, class43.anInt716),
						method317(-361, j7, class43.anInt717), method317(-361, j7, class43.anInt719));
			}
		}
	}

	public void method316(int i, byte byte0, int j, int k, Class40 class40, int l, int i1, int j1) {
		int k1 = class40.anIntArray673.length;
		if (byte0 != 99)
			return;
		for (int l1 = 0; l1 < k1; l1++) {
			int i2 = class40.anIntArray673[l1] - cameraFocusXPix;
			int k2 = class40.anIntArray674[l1] - cameraPosHeight;
			int i3 = class40.anIntArray675[l1] - cameraPosYPix;
			int k3 = i3 * k + i2 * j1 >> 16;
			i3 = i3 * j1 - i2 * k >> 16;
			i2 = k3;
			k3 = k2 * l - i3 * j >> 16;
			i3 = k2 * j + i3 * l >> 16;
			k2 = k3;
			if (i3 < 50)
				return;
			if (class40.anIntArray682 != null) {
				Class40.anIntArray690[l1] = i2;
				Class40.anIntArray691[l1] = k2;
				Class40.anIntArray692[l1] = i3;
			}
			Class40.anIntArray688[l1] = Class30_Sub2_Sub1_Sub3.anInt1466 + (i2 << 9) / i3;
			Class40.anIntArray689[l1] = Class30_Sub2_Sub1_Sub3.anInt1467 + (k2 << 9) / i3;
		}

		Class30_Sub2_Sub1_Sub3.anInt1465 = 0;
		k1 = class40.anIntArray679.length;
		for (int j2 = 0; j2 < k1; j2++) {
			int l2 = class40.anIntArray679[j2];
			int j3 = class40.anIntArray680[j2];
			int l3 = class40.anIntArray681[j2];
			int i4 = Class40.anIntArray688[l2];
			int j4 = Class40.anIntArray688[j3];
			int k4 = Class40.anIntArray688[l3];
			int l4 = Class40.anIntArray689[l2];
			int i5 = Class40.anIntArray689[j3];
			int j5 = Class40.anIntArray689[l3];
			if ((i4 - j4) * (j5 - i5) - (l4 - i5) * (k4 - j4) > 0) {
				Class30_Sub2_Sub1_Sub3.aBoolean1462 = false;
				if (i4 < 0 || j4 < 0 || k4 < 0 || i4 > Class30_Sub2_Sub1.endWidthMinusOne
						|| j4 > Class30_Sub2_Sub1.endWidthMinusOne || k4 > Class30_Sub2_Sub1.endWidthMinusOne)
					Class30_Sub2_Sub1_Sub3.aBoolean1462 = true;
				if (aBoolean467 && method318(anInt468, anInt469, l4, i5, j5, i4, j4, k4)) {
					anInt470 = i;
					anInt471 = i1;
				}
				if (class40.anIntArray682 == null || class40.anIntArray682[j2] == -1) {
					if (class40.anIntArray676[j2] != 0xbc614e)
						Class30_Sub2_Sub1_Sub3.method374(l4, i5, j5, i4, j4, k4, class40.anIntArray676[j2],
								class40.anIntArray677[j2], class40.anIntArray678[j2]);
				} else if (!aBoolean436) {
					if (class40.aBoolean683)
						Class30_Sub2_Sub1_Sub3.method378(l4, i5, j5, i4, j4, k4, class40.anIntArray676[j2],
								class40.anIntArray677[j2], class40.anIntArray678[j2], Class40.anIntArray690[0],
								Class40.anIntArray690[1], Class40.anIntArray690[3], Class40.anIntArray691[0],
								Class40.anIntArray691[1], Class40.anIntArray691[3], Class40.anIntArray692[0],
								Class40.anIntArray692[1], Class40.anIntArray692[3], class40.anIntArray682[j2]);
					else
						Class30_Sub2_Sub1_Sub3.method378(l4, i5, j5, i4, j4, k4, class40.anIntArray676[j2],
								class40.anIntArray677[j2], class40.anIntArray678[j2], Class40.anIntArray690[l2],
								Class40.anIntArray690[j3], Class40.anIntArray690[l3], Class40.anIntArray691[l2],
								Class40.anIntArray691[j3], Class40.anIntArray691[l3], Class40.anIntArray692[l2],
								Class40.anIntArray692[j3], Class40.anIntArray692[l3], class40.anIntArray682[j2]);
				} else {
					int k5 = anIntArray485[class40.anIntArray682[j2]];
					Class30_Sub2_Sub1_Sub3.method374(l4, i5, j5, i4, j4, k4,
							method317(-361, k5, class40.anIntArray676[j2]),
							method317(-361, k5, class40.anIntArray677[j2]),
							method317(-361, k5, class40.anIntArray678[j2]));
				}
			}
		}

	}

	public int method317(int i, int j, int k) {
		k = 127 - k;
		k = (k * (j & 0x7f)) / 160;
		if (i >= 0)
			return anInt430;
		if (k < 2)
			k = 2;
		else if (k > 126)
			k = 126;
		return (j & 0xff80) + k;
	}

	public boolean method318(int i, int j, int k, int l, int i1, int j1, int k1, int l1) {
		if (j < k && j < l && j < i1)
			return false;
		if (j > k && j > l && j > i1)
			return false;
		if (i < j1 && i < k1 && i < l1)
			return false;
		if (i > j1 && i > k1 && i > l1)
			return false;
		int i2 = (j - k) * (k1 - j1) - (i - j1) * (l - k);
		int j2 = (j - i1) * (j1 - l1) - (i - l1) * (k - i1);
		int k2 = (j - l) * (l1 - k1) - (i - k1) * (i1 - l);
		return i2 * k2 > 0 && k2 * j2 > 0;
	}

	private void method319(int i) {
		if (i != 0)
			return;
		int j = anIntArray473[anInt447];
		Class47 aclass47[] = aClass47ArrayArray474[anInt447];
		anInt475 = 0;
		for (int k = 0; k < j; k++) {
			Class47 class47 = aclass47[k];
			if (class47.anInt791 == 1) {
				int xTile = (class47.anInt787 - cameraFocusXTile) + viewDistance;
				if (xTile < 0 || xTile > 2 * viewDistance)
					continue;
				int yTile = (class47.anInt789 - cameraFocusYTile) + viewDistance;
				if (yTile < 0)
					yTile = 0;
				int j2 = (class47.anInt790 - cameraFocusYTile) + viewDistance;
				if (j2 > 2 * viewDistance)
					j2 = 2 * viewDistance;
				boolean flag = false;
				while (yTile <= j2)
					if (tilesVisibleForThisAngle[xTile][yTile++]) {
						flag = true;
						break;
					}
				if (!flag)
					continue;
				int j3 = cameraFocusXPix - class47.anInt792;
				if (j3 > 32) {
					class47.anInt798 = 1;
				} else {
					if (j3 >= -32)
						continue;
					class47.anInt798 = 2;
					j3 = -j3;
				}
				class47.anInt801 = (class47.anInt794 - cameraPosYPix << 8) / j3;
				class47.anInt802 = (class47.anInt795 - cameraPosYPix << 8) / j3;
				class47.anInt803 = (class47.anInt796 - cameraPosHeight << 8) / j3;
				class47.anInt804 = (class47.anInt797 - cameraPosHeight << 8) / j3;
				aClass47Array476[anInt475++] = class47;
				continue;
			}
			if (class47.anInt791 == 2) {
				int yTile = (class47.anInt789 - cameraFocusYTile) + viewDistance;
				if (yTile < 0 || yTile > 2 * viewDistance)
					continue;
				int xTile = (class47.anInt787 - cameraFocusXTile) + viewDistance;
				if (xTile < 0)
					xTile = 0;
				int k2 = (class47.anInt788 - cameraFocusXTile) + viewDistance;
				if (k2 > 2 * viewDistance)
					k2 = 2 * viewDistance;
				boolean flag1 = false;
				while (xTile <= k2)
					if (tilesVisibleForThisAngle[xTile++][yTile]) {
						flag1 = true;
						break;
					}
				if (!flag1)
					continue;
				int k3 = cameraPosYPix - class47.anInt794;
				if (k3 > 32) {
					class47.anInt798 = 3;
				} else {
					if (k3 >= -32)
						continue;
					class47.anInt798 = 4;
					k3 = -k3;
				}
				class47.anInt799 = (class47.anInt792 - cameraFocusXPix << 8) / k3;
				class47.anInt800 = (class47.anInt793 - cameraFocusXPix << 8) / k3;
				class47.anInt803 = (class47.anInt796 - cameraPosHeight << 8) / k3;
				class47.anInt804 = (class47.anInt797 - cameraPosHeight << 8) / k3;
				aClass47Array476[anInt475++] = class47;
			} else if (class47.anInt791 == 4) {
				int j1 = class47.anInt796 - cameraPosHeight;
				if (j1 > 128) {
					int i2 = (class47.anInt789 - cameraFocusYTile) + viewDistance;
					if (i2 < 0)
						i2 = 0;
					int l2 = (class47.anInt790 - cameraFocusYTile) + viewDistance;
					if (l2 > 2 * viewDistance)
						l2 = 2 * viewDistance;
					if (i2 <= l2) {
						int i3 = (class47.anInt787 - cameraFocusXTile) + viewDistance;
						if (i3 < 0)
							i3 = 0;
						int l3 = (class47.anInt788 - cameraFocusXTile) + viewDistance;
						if (l3 > 2 * viewDistance)
							l3 = 2 * viewDistance;
						boolean flag2 = false;
						label0: for (int xTile = i3; xTile <= l3; xTile++) {
							for (int yTile = i2; yTile <= l2; yTile++) {
								if (!tilesVisibleForThisAngle[xTile][yTile])
									continue;
								flag2 = true;
								break label0;
							}

						}

						if (flag2) {
							class47.anInt798 = 5;
							class47.anInt799 = (class47.anInt792 - cameraFocusXPix << 8) / j1;
							class47.anInt800 = (class47.anInt793 - cameraFocusXPix << 8) / j1;
							class47.anInt801 = (class47.anInt794 - cameraPosYPix << 8) / j1;
							class47.anInt802 = (class47.anInt795 - cameraPosYPix << 8) / j1;
							aClass47Array476[anInt475++] = class47;
						}
					}
				}
			}
		}

	}

	private boolean method320(int storey, int xTile, int yTile) {
		int l = anIntArrayArrayArray445[storey][xTile][yTile];
		if (l == -anInt448)
			return false;
		if (l == anInt448)
			return true;
		int i1 = xTile << 7;
		int j1 = yTile << 7;
		if (method324(i1 + 1, tileCornerHeight[storey][xTile][yTile], j1 + 1)
				&& method324((i1 + 128) - 1, tileCornerHeight[storey][xTile + 1][yTile], j1 + 1)
				&& method324((i1 + 128) - 1, tileCornerHeight[storey][xTile + 1][yTile + 1], (j1 + 128) - 1)
				&& method324(i1 + 1, tileCornerHeight[storey][xTile][yTile + 1], (j1 + 128) - 1)) {
			anIntArrayArrayArray445[storey][xTile][yTile] = anInt448;
			return true;
		} else {
			anIntArrayArrayArray445[storey][xTile][yTile] = -anInt448;
			return false;
		}
	}

	private boolean method321(int storey, int xTile, int yTile, int l) {
		if (!method320(storey, xTile, yTile))
			return false;
		int i1 = xTile << 7;
		int j1 = yTile << 7;
		int k1 = tileCornerHeight[storey][xTile][yTile] - 1;
		int l1 = k1 - 120;
		int i2 = k1 - 230;
		int j2 = k1 - 238;
		if (l < 16)
		{
			if (l == 1)
			{
				if (i1 > cameraFocusXPix)
				{
					if (!method324(i1, k1, j1))
						return false;
					if (!method324(i1, k1, j1 + 128))
						return false;
				}
				if (storey > 0)
				{
					if (!method324(i1, l1, j1))
						return false;
					if (!method324(i1, l1, j1 + 128))
						return false;
				}
				if (!method324(i1, i2, j1))
					return false;
				return method324(i1, i2, j1 + 128);
			}
			if (l == 2)
			{
				if (j1 < cameraPosYPix)
				{
					if (!method324(i1, k1, j1 + 128))
						return false;
					if (!method324(i1 + 128, k1, j1 + 128))
						return false;
				}
				if (storey > 0)
				{
					if (!method324(i1, l1, j1 + 128))
						return false;
					if (!method324(i1 + 128, l1, j1 + 128))
						return false;
				}
				if (!method324(i1, i2, j1 + 128))
					return false;
				return method324(i1 + 128, i2, j1 + 128);
			}
			if (l == 4)
			{
				if (i1 < cameraFocusXPix)
				{
					if (!method324(i1 + 128, k1, j1))
						return false;
					if (!method324(i1 + 128, k1, j1 + 128))
						return false;
				}
				if (storey > 0)
				{
					if (!method324(i1 + 128, l1, j1))
						return false;
					if (!method324(i1 + 128, l1, j1 + 128))
						return false;
				}
				if (!method324(i1 + 128, i2, j1))
					return false;
				return method324(i1 + 128, i2, j1 + 128);
			}
			if (l == 8)
			{
				if (j1 > cameraPosYPix)
				{
					if (!method324(i1, k1, j1))
						return false;
					if (!method324(i1 + 128, k1, j1))
						return false;
				}
				if (storey > 0)
				{
					if (!method324(i1, l1, j1))
						return false;
					if (!method324(i1 + 128, l1, j1))
						return false;
				}
				if (!method324(i1, i2, j1))
					return false;
				return method324(i1 + 128, i2, j1);
			}
		}
		if (!method324(i1 + 64, j2, j1 + 64))
			return false;
		if (l == 16)
			return method324(i1, i2, j1 + 128);
		if (l == 32)
			return method324(i1 + 128, i2, j1 + 128);
		if (l == 64)
			return method324(i1 + 128, i2, j1);
		if (l == 128) {
			return method324(i1, i2, j1);
		} else {
			System.out.println("Warning unsupported wall type");
			return true;
		}
	}

	private boolean method322(int storey, int xTile, int yTile, int l) {
		if (!method320(storey, xTile, yTile))
			return false;
		int i1 = xTile << 7;
		int j1 = yTile << 7;
		return method324(i1 + 1, tileCornerHeight[storey][xTile][yTile] - l, j1 + 1)
				&& method324((i1 + 128) - 1, tileCornerHeight[storey][xTile + 1][yTile] - l, j1 + 1)
				&& method324((i1 + 128) - 1, tileCornerHeight[storey][xTile + 1][yTile + 1] - l, (j1 + 128) - 1)
				&& method324(i1 + 1, tileCornerHeight[storey][xTile][yTile + 1] - l, (j1 + 128) - 1);
	}

	private boolean method323(int storey, int xTile, int k, int yTile, int i1, int j1) {
		if (xTile == k && yTile == i1) {
			if (!method320(storey, xTile, yTile))
				return false;
			int k1 = xTile << 7;
			int i2 = yTile << 7;
			return method324(k1 + 1, tileCornerHeight[storey][xTile][yTile] - j1, i2 + 1)
					&& method324((k1 + 128) - 1, tileCornerHeight[storey][xTile + 1][yTile] - j1, i2 + 1)
					&& method324((k1 + 128) - 1, tileCornerHeight[storey][xTile + 1][yTile + 1] - j1, (i2 + 128) - 1)
					&& method324(k1 + 1, tileCornerHeight[storey][xTile][yTile + 1] - j1, (i2 + 128) - 1);
		}
		for (int l1 = xTile; l1 <= k; l1++) {
			for (int j2 = yTile; j2 <= i1; j2++)
				if (anIntArrayArrayArray445[storey][l1][j2] == -anInt448)
					return false;

		}

		int k2 = (xTile << 7) + 1;
		int l2 = (yTile << 7) + 2;
		int i3 = tileCornerHeight[storey][xTile][yTile] - j1;
		if (!method324(k2, i3, l2))
			return false;
		int j3 = (k << 7) - 1;
		if (!method324(j3, i3, l2))
			return false;
		int k3 = (i1 << 7) - 1;
		if (!method324(k2, i3, k3))
			return false;
		return method324(j3, i3, k3);
	}

	private boolean method324(int i, int j, int k) {
		for (int l = 0; l < anInt475; l++) {
			Class47 class47 = aClass47Array476[l];
			if (class47.anInt798 == 1) {
				int i1 = class47.anInt792 - i;
				if (i1 > 0) {
					int j2 = class47.anInt794 + (class47.anInt801 * i1 >> 8);
					int k3 = class47.anInt795 + (class47.anInt802 * i1 >> 8);
					int l4 = class47.anInt796 + (class47.anInt803 * i1 >> 8);
					int i6 = class47.anInt797 + (class47.anInt804 * i1 >> 8);
					if (k >= j2 && k <= k3 && j >= l4 && j <= i6)
						return true;
				}
			} else if (class47.anInt798 == 2) {
				int j1 = i - class47.anInt792;
				if (j1 > 0) {
					int k2 = class47.anInt794 + (class47.anInt801 * j1 >> 8);
					int l3 = class47.anInt795 + (class47.anInt802 * j1 >> 8);
					int i5 = class47.anInt796 + (class47.anInt803 * j1 >> 8);
					int j6 = class47.anInt797 + (class47.anInt804 * j1 >> 8);
					if (k >= k2 && k <= l3 && j >= i5 && j <= j6)
						return true;
				}
			} else if (class47.anInt798 == 3) {
				int k1 = class47.anInt794 - k;
				if (k1 > 0) {
					int l2 = class47.anInt792 + (class47.anInt799 * k1 >> 8);
					int i4 = class47.anInt793 + (class47.anInt800 * k1 >> 8);
					int j5 = class47.anInt796 + (class47.anInt803 * k1 >> 8);
					int k6 = class47.anInt797 + (class47.anInt804 * k1 >> 8);
					if (i >= l2 && i <= i4 && j >= j5 && j <= k6)
						return true;
				}
			} else if (class47.anInt798 == 4) {
				int l1 = k - class47.anInt794;
				if (l1 > 0) {
					int i3 = class47.anInt792 + (class47.anInt799 * l1 >> 8);
					int j4 = class47.anInt793 + (class47.anInt800 * l1 >> 8);
					int k5 = class47.anInt796 + (class47.anInt803 * l1 >> 8);
					int l6 = class47.anInt797 + (class47.anInt804 * l1 >> 8);
					if (i >= i3 && i <= j4 && j >= k5 && j <= l6)
						return true;
				}
			} else if (class47.anInt798 == 5) {
				int i2 = j - class47.anInt796;
				if (i2 > 0) {
					int j3 = class47.anInt792 + (class47.anInt799 * i2 >> 8);
					int k4 = class47.anInt793 + (class47.anInt800 * i2 >> 8);
					int l5 = class47.anInt794 + (class47.anInt801 * i2 >> 8);
					int i7 = class47.anInt795 + (class47.anInt802 * i2 >> 8);
					if (i >= j3 && i <= k4 && k >= l5 && k <= i7)
						return true;
				}
			}
		}

		return false;
	}

	private boolean aBoolean429;
	private int anInt430;
	private static int anInt431 = 360;
	private static int anInt432 = 1;
	private static int anInt433 = -460;
	private boolean aBoolean434;
	private boolean aBoolean435;
	public static boolean aBoolean436 = true;
	int highestStorey;
	int totNbrXTiles;
	int totNbrYTiles;
	int tileCornerHeight[][][];
	Class30_Sub3 tilesForAllStoreys[][][];
	int lowestStorey;
	int anInt443;
	Class28 aClass28Array444[];
	int anIntArrayArrayArray445[][][];
	static int anInt446;
	static int anInt447;
	static int anInt448;
	static int xMinTile;
	static int xMaxTile;
	static int yMinTile;
	static int yMaxTile;
	static int cameraFocusXTile;
	static int cameraFocusYTile;
	static int cameraFocusXPix;
	static int cameraPosHeight;
	static int cameraPosYPix;
	static int anInt458;
	static int anInt459;
	static int anInt460;
	static int anInt461;
	static Class28 aClass28Array462[] = new Class28[100];
	static final int anIntArray463[] = { 53, -53, -53, 53 };
	static final int anIntArray464[] = { -53, -53, 53, 53 };
	static final int anIntArray465[] = { -45, 45, 45, -45 };
	static final int anIntArray466[] = { 45, 45, -45, -45 };
	static boolean aBoolean467;
	static int anInt468;
	static int anInt469;
	public static int anInt470 = -1;
	public static int anInt471 = -1;
	static int anInt472;
	static int anIntArray473[];
	static Class47 aClass47ArrayArray474[][];
	public static int anInt475;
	static Class47 aClass47Array476[] = new Class47[500];
	static Class19 aClass19_477 = new Class19(169);
	static final int anIntArray478[] = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	static final int anIntArray479[] = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	static final int anIntArray480[] = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	static final int anIntArray481[] = { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	static final int anIntArray482[] = { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	static final int anIntArray483[] = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static final int anIntArray484[] = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static final int anIntArray485[] = { 41, 39248, 41, 4643, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 43086, 41, 41,
			41, 41, 41, 41, 41, 8602, 41, 28992, 41, 41, 41, 41, 41, 5056, 41, 41, 41, 7079, 41, 41, 41, 41, 41, 41, 41,
			41, 41, 41, 3131, 41, 41, 41 };
	int anIntArray486[];
	int anIntArray487[];
	int anInt488;
	int anIntArrayArray489[][] = { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
			{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
	int anIntArrayArray490[][] = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	static int viewDistance = 25;
	static int horizontalCameraAngles = 32;
	static int verticalCameraAngles = 8;
	static boolean tileVisible[][][][] = new boolean[verticalCameraAngles][horizontalCameraAngles][2 * viewDistance
			+ 1][2 * viewDistance + 1];
	static boolean tilesVisibleForThisAngle[][];
	static int anInt493;
	static int anInt494;
	static int anInt495;
	static int anInt496;
	static int anInt497;
	static int anInt498;

	static {
		anInt472 = 4;
		anIntArray473 = new int[anInt472];
		aClass47ArrayArray474 = new Class47[anInt472][500];
	}
}
