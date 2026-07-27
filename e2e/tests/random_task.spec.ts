import { test, expect } from '@playwright/test';

test('title is Random Task', async ({ page }) => {
    await page.goto("http://localhost:5173");

    expect(await page.title()).toEqual("Random Task");
});

